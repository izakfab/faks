'================================================================
' FORECAST_ETS  –  Replicates Excel's FORECAST.ETS for LibreOffice Calc
' Algorithm: Holt-Winters ETS(A,A,A) with Nelder-Mead optimisation
'
' INSTALLATION
'   1. In LibreOffice Calc: Tools → Macros → Edit Macros
'   2. In the left panel expand: My Macros & Dialogs → Standard
'   3. Click Module1 (or any module under Standard)
'   4. Paste this entire file, then close the Basic IDE
'   The function is now available in every LibreOffice Calc document.
'
' USAGE IN A CELL
'   =FORECAST_ETS( target_date,  values,  dates  [, seasonality] )
'
'   target_date  – the date you want to forecast (date cell or DATE())
'   values       – range with historical values       e.g. B2:B25
'   dates        – range with corresponding dates     e.g. A2:A25
'   seasonality  – optional, default 12 (monthly data with yearly pattern)
'
' EXAMPLE
'   =FORECAST_ETS(A26, B$2:B$25, A$2:A$25, 12)
'   Fill down through the forecast rows.
'================================================================
Option Explicit

' ---------------------------------------------------------------
' Main function – callable from any cell
' ---------------------------------------------------------------
Function FORECAST_ETS(target As Variant, yRng As Variant, _
                      tRng As Variant, _
                      Optional m As Variant) As Double

    Dim n As Long, nt As Long
    Dim y() As Double
    Dim t() As Double
    Dim mInt As Integer
    If IsMissing(m) Then mInt = 12 Else mInt = CInt(m)

    If Not GetRange(yRng, y, n) Then Exit Function
    If Not GetRange(tRng, t, nt) Then Exit Function
    If n <> nt Then Exit Function
    If n < 2 * mInt Then Exit Function

    ' Average step size handles unequal month lengths (28-31 days)
    Dim avgStep As Double
    avgStep = (t(n - 1) - t(0)) / (n - 1)
    If avgStep <= 0 Then Exit Function

    Dim h As Long
    h = CLng((CDbl(target) - t(n - 1)) / avgStep)
    If h <= 0 Then Exit Function

    ' -- Initialise level, trend, seasonal components --
    Dim l0 As Double, b0 As Double
    Dim s0() As Double
    ReDim s0(mInt - 1)
    Call HW_Init(y, n, mInt, l0, b0, s0)

    ' -- Optimise alpha, beta, gamma via Nelder-Mead --
    Dim alpha As Double, beta As Double, gamma As Double
    Call HW_Optimize(y, n, mInt, l0, b0, s0, alpha, beta, gamma)

    ' -- Run ETS once more to capture the final state --
    Dim lT As Double, bT As Double
    Dim sT() As Double
    ReDim sT(mInt - 1)
    Call HW_Run(y, n, mInt, alpha, beta, gamma, l0, b0, s0, lT, bT, sT)

    ' -- h-step-ahead forecast --
    ' Seasonal index: which of the m seasonal components applies to step h
    Dim sIdx As Long
    sIdx = ((n - 1 + h) Mod mInt + mInt) Mod mInt
    FORECAST_ETS = lT + h * bT + sT(sIdx)

End Function

' ---------------------------------------------------------------
' Convert a cell range (or scalar) to a 1-D Double array.
' Handles both column ranges (many rows, 1 col) and row ranges.
' ---------------------------------------------------------------
Function GetRange(rng As Variant, arr() As Double, n As Long) As Boolean
    GetRange = False
    If Not IsArray(rng) Then Exit Function

    Dim r1 As Long, r2 As Long, c1 As Long, c2 As Long
    r1 = LBound(rng, 1) : r2 = UBound(rng, 1)
    c1 = LBound(rng, 2) : c2 = UBound(rng, 2)

    Dim i As Long
    If (r2 - r1) >= (c2 - c1) Then          ' column-oriented range
        n = r2 - r1 + 1
        ReDim arr(n - 1)
        For i = 0 To n - 1
            arr(i) = CDbl(rng(r1 + i, c1))
        Next i
    Else                                     ' row-oriented range
        n = c2 - c1 + 1
        ReDim arr(n - 1)
        For i = 0 To n - 1
            arr(i) = CDbl(rng(r1, c1 + i))
        Next i
    End If

    GetRange = True
End Function

' ---------------------------------------------------------------
' Initialise level (l0), trend (b0) and seasonal components (s0)
' using classical Holt-Winters decomposition.
' ---------------------------------------------------------------
Sub HW_Init(y() As Double, n As Long, m As Integer, _
            ByRef l0 As Double, ByRef b0 As Double, ByRef s0() As Double)

    Dim K As Long : K = n \ m        ' number of complete cycles

    ' Cycle averages
    Dim cyc() As Double : ReDim cyc(K - 1)
    Dim i As Long, j As Integer, sm As Double
    For i = 0 To K - 1
        sm = 0
        For j = 0 To m - 1
            sm = sm + y(i * m + j)
        Next j
        cyc(i) = sm / m
    Next i

    ' Initial trend: OLS slope of cycle averages, per observation
    Dim sx As Double, sy As Double, sxy As Double, sx2 As Double
    For i = 0 To K - 1
        sx  = sx  + i
        sy  = sy  + cyc(i)
        sxy = sxy + i * cyc(i)
        sx2 = sx2 + i * i
    Next i
    Dim D As Double : D = K * sx2 - sx * sx
    If D <> 0 Then
        b0 = (K * sxy - sx * sy) / D / m
    Else
        b0 = 0
    End If

    ' Initial level: first cycle average adjusted back to t=0
    l0 = cyc(0) - (m / 2.0) * b0

    ' Initial seasonal indices: detrended averages, forced to sum to zero
    Dim ss() As Double : ReDim ss(m - 1)
    Dim sc() As Long   : ReDim sc(m - 1)
    For i = 0 To n - 1
        j = i Mod m
        ss(j) = ss(j) + (y(i) - (l0 + i * b0))
        sc(j) = sc(j) + 1
    Next i
    Dim avg As Double : avg = 0
    For j = 0 To m - 1
        s0(j) = ss(j) / sc(j)
        avg = avg + s0(j)
    Next j
    avg = avg / m
    For j = 0 To m - 1
        s0(j) = s0(j) - avg     ' normalise: sum = 0
    Next j

End Sub

' ---------------------------------------------------------------
' Sum of squared 1-step-ahead prediction errors for given (a, bt, g).
' ---------------------------------------------------------------
Function HW_SSE(y() As Double, n As Long, m As Integer, _
                a As Double, bt As Double, g As Double, _
                l0 As Double, b0 As Double, s0() As Double) As Double

    Dim s() As Double : ReDim s(m - 1)
    Dim j As Integer
    For j = 0 To m - 1 : s(j) = s0(j) : Next j

    Dim l As Double : l = l0
    Dim b As Double : b = b0
    Dim sse As Double
    Dim lN As Double
    Dim err As Double
    Dim i As Long

    For i = 0 To n - 1
        j = i Mod m
        err = y(i) - (l + b + s(j))
        sse = sse + err * err
        lN   = a  * (y(i) - s(j)) + (1 - a)  * (l + b)
        b    = bt * (lN - l)       + (1 - bt) * b
        s(j) = g  * (y(i) - lN)   + (1 - g)  * s(j)
        l    = lN
    Next i

    HW_SSE = sse
End Function

' ---------------------------------------------------------------
' Nelder-Mead minimisation of HW_SSE over (alpha, beta, gamma).
' Simplex vertices are kept in (0.001, 0.999) via Cl01().
' ---------------------------------------------------------------
Sub HW_Optimize(y() As Double, n As Long, m As Integer, _
                l0 As Double, b0 As Double, s0() As Double, _
                ByRef alpha As Double, ByRef beta As Double, ByRef gamma As Double)

    Const MAXITER As Long  = 2000
    Const FTOL    As Double = 1E-10

    ' 4-vertex simplex, each vertex is a point (a, b, g) in [0,1]^3
    Dim p(3, 2) As Double
    Dim fv(3)   As Double

    p(0, 0) = 0.20 : p(0, 1) = 0.05 : p(0, 2) = 0.20
    p(1, 0) = 0.70 : p(1, 1) = 0.05 : p(1, 2) = 0.20
    p(2, 0) = 0.20 : p(2, 1) = 0.40 : p(2, 2) = 0.20
    p(3, 0) = 0.20 : p(3, 1) = 0.05 : p(3, 2) = 0.70

    Dim i As Integer, j As Integer, tmp As Double
    For i = 0 To 3
        fv(i) = HW_SSE(y, n, m, p(i, 0), p(i, 1), p(i, 2), l0, b0, s0)
    Next i

    Dim iter As Long
    Dim swapped As Boolean
    Dim c(2) As Double
    Dim r(2) As Double
    Dim ex(2) As Double
    Dim k(2) As Double
    Dim fr As Double
    Dim fe As Double
    Dim fk As Double

    For iter = 1 To MAXITER

        ' Sort vertices ascending by SSE (bubble sort, 4 elements)
        Do
            swapped = False
            For i = 0 To 2
                If fv(i) > fv(i + 1) Then
                    tmp = fv(i) : fv(i) = fv(i + 1) : fv(i + 1) = tmp
                    For j = 0 To 2
                        tmp = p(i, j) : p(i, j) = p(i + 1, j) : p(i + 1, j) = tmp
                    Next j
                    swapped = True
                End If
            Next i
        Loop While swapped

        ' Convergence check
        If fv(3) - fv(0) < FTOL Then Exit For

        ' Centroid of the best 3 vertices
        For j = 0 To 2
            c(j) = (p(0, j) + p(1, j) + p(2, j)) / 3.0
        Next j

        ' Reflect worst vertex through centroid
        For j = 0 To 2 : r(j) = Cl01(2 * c(j) - p(3, j)) : Next j
        fr = HW_SSE(y, n, m, r(0), r(1), r(2), l0, b0, s0)

        If fr < fv(0) Then
            ' Reflection improved the best – try expansion
            For j = 0 To 2 : ex(j) = Cl01(3 * c(j) - 2 * p(3, j)) : Next j
            fe = HW_SSE(y, n, m, ex(0), ex(1), ex(2), l0, b0, s0)
            If fe < fr Then
                For j = 0 To 2 : p(3, j) = ex(j) : Next j : fv(3) = fe
            Else
                For j = 0 To 2 : p(3, j) = r(j) : Next j : fv(3) = fr
            End If

        ElseIf fr < fv(2) Then
            ' Reflection is better than second-worst – accept it
            For j = 0 To 2 : p(3, j) = r(j) : Next j : fv(3) = fr

        Else
            ' Reflection did not help – try contraction
            If fr < fv(3) Then
                For j = 0 To 2 : p(3, j) = r(j) : Next j : fv(3) = fr
            End If
            For j = 0 To 2 : k(j) = Cl01(0.5 * (c(j) + p(3, j))) : Next j
            fk = HW_SSE(y, n, m, k(0), k(1), k(2), l0, b0, s0)
            If fk < fv(3) Then
                For j = 0 To 2 : p(3, j) = k(j) : Next j : fv(3) = fk
            Else
                ' Contraction failed – shrink all vertices toward the best
                For i = 1 To 3
                    For j = 0 To 2
                        p(i, j) = Cl01(0.5 * (p(0, j) + p(i, j)))
                    Next j
                    fv(i) = HW_SSE(y, n, m, p(i, 0), p(i, 1), p(i, 2), l0, b0, s0)
                Next i
            End If
        End If

    Next iter

    ' Best vertex is at index 0 after the last sort
    alpha = p(0, 0) : beta = p(0, 1) : gamma = p(0, 2)

End Sub

' Clamp to (0.001, 0.999) to keep parameters in the valid open interval
Function Cl01(x As Double) As Double
    If x < 0.001 Then
        Cl01 = 0.001
    ElseIf x > 0.999 Then
        Cl01 = 0.999
    Else
        Cl01 = x
    End If
End Function

' ---------------------------------------------------------------
' Run ETS forward through all observations and return the final
' state (lOut, bOut, sOut) used for forecasting.
' ---------------------------------------------------------------
Sub HW_Run(y() As Double, n As Long, m As Integer, _
           a As Double, bt As Double, g As Double, _
           l0 As Double, b0 As Double, s0() As Double, _
           ByRef lOut As Double, ByRef bOut As Double, ByRef sOut() As Double)

    Dim s() As Double : ReDim s(m - 1)
    Dim j As Integer
    For j = 0 To m - 1 : s(j) = s0(j) : Next j

    Dim l As Double : l = l0
    Dim b As Double : b = b0
    Dim lN As Double
    Dim i As Long

    For i = 0 To n - 1
        j    = i Mod m
        lN   = a  * (y(i) - s(j)) + (1 - a)  * (l + b)
        b    = bt * (lN - l)       + (1 - bt) * b
        s(j) = g  * (y(i) - lN)   + (1 - g)  * s(j)
        l    = lN
    Next i

    lOut = l : bOut = b
    For j = 0 To m - 1 : sOut(j) = s(j) : Next j

End Sub

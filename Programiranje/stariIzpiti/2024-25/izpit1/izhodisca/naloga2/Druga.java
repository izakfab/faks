
/*
Samodejno testiranje:

tj.exe Druga.java . .

Javni testni primeri:

01: primer iz besedila
02--06: k = 1
01, 07--10: splošni primeri
*/

import java.util.*;

public class Druga {

    public static void main(String[] args) {
        // dopolnite ...
		Scanner s = new Scanner(System.in);
		int stVijakov = s.nextInt();
		int stTipov = s.nextInt();
		int stVijacnikovNaTip = s.nextInt();
		int[] vijacniki = new int[stTipov * stVijacnikovNaTip];
		int casVijacenja = s.nextInt();
		int casHlajenja = s.nextInt();
		int trenutniCas = 0;

		while (s.hasNextInt()) {
			int tip = s.nextInt();
			int index = indexNajmanjsegaCasa(vijacniki, tip, stTipov);
			// trenutniCas = trenutniCas < vijacniki[index] ? vijacniki[index] : trenutniCas;
			if (trenutniCas < vijacniki[index]) {
				trenutniCas = vijacniki[index];
			}
			trenutniCas += casVijacenja;
			vijacniki[index] = trenutniCas + casHlajenja;
		}
		System.out.println(trenutniCas);
    }

    // pomo"zne metode, notranji razredi (po potrebi) ...
	static int indexNajmanjsegaCasa(int[] tab, int tip, int stTipov) {
		int min = Integer.MAX_VALUE;
		int minIndex = tip;

		for (int i = tip; i < tab.length; i += stTipov) {
			if (tab[i] < min) {
				min = tab[i];
				minIndex = i;
			}
		}
		return minIndex;
	}
}

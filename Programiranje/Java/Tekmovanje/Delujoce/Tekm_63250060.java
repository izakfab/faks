import java.util.Arrays;
import java.util.Scanner;
import java.math.BigInteger;

public class Tekm_63250060 {

	public static void main() {

		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		int n = s.nextInt();
		int k = s.nextInt();
		BigInteger m = new BigInteger(s.next());
		int[] r = t == 1 ? k(n, k, m) : t == 2 ? kP(n, k, m) : t == 3 ? v(n, k, m) : vP(n, k, m);
		s.close();
		System.out.print("[" + r[0]);
		for (int i = 1; i < r.length; i++) {
			System.out.print(", " + r[i]);
		}
		System.out.println("]");
	}


	public static BigInteger f(int x) {
		if (x == 0) return BigInteger.ONE;
		BigInteger r = BigInteger.ONE;
		for (int i = 2; i <= x; i++)
		    r = r.multiply(BigInteger.valueOf(i));
		return r;
	}

	public static BigInteger sK(int n, int k) {
		return f(n).divide(f(k).multiply(f(n - k)));
	}

	public static BigInteger sKP(int n, int k) {
		return f(n + k - 1).divide(f(k).multiply(f(n - 1)));
	}


	public static int[] k(int n, int k, BigInteger m) {
		BigInteger v = BigInteger.ZERO;
		int[] r = new int[k];
		for (int i = 0; i < k; i++) {
			int j;
			if (i == 0)
				j = 1;
			else
				j = r[i - 1] + 1;
			while (v.add(sK(n - j, k - i - 1)).compareTo(m) < 0) {
    			v = v.add(sK(n - j, k - i - 1));
				j++;
			}
			r[i] = j;
		}
		return r;
	}

	public static int[] kP(int n, int k, BigInteger m) {
		BigInteger v = BigInteger.ZERO;
		int[] r = new int[k];
		for (int i = 0; i < k; i++) {
			int j;
			if (i == 0)
				j = 1;
			else
				j = r[i - 1];
			while (v.add(sKP(n - j + 1, k - i - 1)).compareTo(m) < 0) {
				v = v.add(sKP(n - j + 1, k - i - 1));
				j++;
			}
			r[i] = j;
		}
		return r;
	}

	public static int[] v(int n, int k, BigInteger m) {
		int[] r = new int[k];
		BigInteger M = m;
		for (int i = 0; i < k; i++) {
			BigInteger[] d = M.divideAndRemainder(f(n - i - 1).divide(f(n - k)));
			d[0] = d[1].signum() == 0 ? d[0] : d[0].add(BigInteger.ONE);
			d[1] = d[1].signum() == 0 ? f(n - i - 1).divide(f(n - k)) : d[1];
			r[i] = d[0].intValue();
			M = d[1];
		}

		for (int i = 0; i < k; i++) {
			int[] s = Arrays.copyOf(r, i);
			Arrays.sort(s);
			for (int j = 0; j < i; j++) {
				r[i] = r[i] >= s[j] ? r[i] + 1 : r[i];
			}
		}
		return r;
	}

	public static int[] vP(int n, int k, BigInteger m) {
		int[] r = new int[k];
		for (int i = 1; i <= k; i++) {
			BigInteger[] d = m.divideAndRemainder(BigInteger.valueOf(n).pow(k -i));
			BigInteger c = d[1].signum() == 0 ? d[0] : d[0].add(BigInteger.ONE);
			int M = c.mod(BigInteger.valueOf(n)).intValue();
			r[i - 1] = M == 0 ? n : M;
		}
		return r;
	}
}

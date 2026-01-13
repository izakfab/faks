import java.util.Arrays;
import java.util.Scanner;
import java.math.BigInteger;

public class Tekm_63250060 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int tip = s.nextInt();
		int n = s.nextInt();
		int k = s.nextInt();
		BigInteger m = new BigInteger(s.next());
		int[] result = tip == 1 ? kombinacije(n, k, m) : tip == 2 ? kombinacijeSPonavljanjem(n, k, m) : tip == 3 ? variacije(n, k, m) : variacijeSPonavljanjem(n, k, m);
		s.close();
		System.out.print("[" + result[0]);
		for (int i = 1; i < result.length; i++) {
			System.out.print(", " + result[i]);
		}
		System.out.println("]");
	}


	public static BigInteger fakulteta(int x) {
		if (x == 0) return BigInteger.ONE;
		BigInteger result = BigInteger.ONE;
		for (int i = 2; i <= x; i++)
		    result = result.multiply(BigInteger.valueOf(i));
		return result;
	}

	public static BigInteger stKombinacij(int n, int k) {
		return fakulteta(n).divide(fakulteta(k).multiply(fakulteta((int) (n - k))));
	}

	public static BigInteger stKombinacijSPonavljanjem(int n, int k) {
		return fakulteta(n + k - 1).divide(fakulteta(k).multiply(fakulteta((int) (n - 1))));
	}


	public static int[] kombinacije(int n, int k, BigInteger m) {
		BigInteger vsota = BigInteger.ZERO;
		int[] result = new int[k];
		for (int i = 0; i < k; i++) {
			int j;
			if (i == 0)
				j = 1;
			else
				j = (int) (result[i - 1] + 1);
			while (vsota.add(stKombinacij((int) (n - j), (int) (k - i - 1))).compareTo(m) < 0) {
    			vsota = vsota.add(stKombinacij((int) (n - j), (int) (k - i - 1)));
				j++;
			}
			result[i] = j;
		}
		return result;
	}

	public static int[] kombinacijeSPonavljanjem(int n, int k, BigInteger m) {
		BigInteger vsota = BigInteger.ZERO;
		int[] result = new int[k];
		for (int i = 0; i < k; i++) {
			int j;
			if (i == 0)
				j = 1;
			else
				j = (int) (result[i - 1]);
			while (vsota.add(stKombinacijSPonavljanjem((int) (n - j + 1), (int) (k - i - 1))).compareTo(m) < 0) {
				vsota = vsota.add(stKombinacijSPonavljanjem((int) (n - j + 1), (int) (k - i - 1)));
				j++;
			}
			result[i] = j;
		}
		return result;
	}

	public static int[] variacije(int n, int k, BigInteger m) {
		int[] result = new int[k];
		BigInteger mod = m;
		for (int i = 0; i < k; i++) {
			BigInteger[] deljenjeInMod = mod.divideAndRemainder(fakulteta(n - i - 1).divide(fakulteta(n - k)));
			deljenjeInMod[0] = deljenjeInMod[1].compareTo(BigInteger.ZERO) == 0 ? deljenjeInMod[0] : deljenjeInMod[0].add(BigInteger.ONE);
			deljenjeInMod[1] = deljenjeInMod[1].compareTo(BigInteger.ZERO) == 0 ? fakulteta(n - i - 1).divide(fakulteta(n - k)) : deljenjeInMod[1];
			result[i] = deljenjeInMod[0].intValue();
			mod = deljenjeInMod[1];
		}

		for (int i = 0; i < k; i++) {
			int[] sorted = Arrays.copyOf(result, i);
			Arrays.sort(sorted);
			for (int j = 0; j < i; j++) {
				result[i] = result[i] >= sorted[j] ? (int) (result[i] + 1) : result[i];
			}

		}
		return result;
	}

	public static int[] variacijeSPonavljanjem(int n, int k, BigInteger m) {
		int[] result = new int[k];
		for (int i = 1; i <= k; i++) {
			BigInteger[] deljenje = m.divideAndRemainder(BigInteger.valueOf(n).pow(k -i));
			BigInteger ceil = deljenje[1].compareTo(BigInteger.ZERO) == 0 ? deljenje[0] : deljenje[0].add(BigInteger.ONE);
			int moduloZn = ceil.mod(BigInteger.valueOf(n)).intValue();
			result[i - 1] = moduloZn == 0 ? n : moduloZn;
		}
		return result;
	}
}

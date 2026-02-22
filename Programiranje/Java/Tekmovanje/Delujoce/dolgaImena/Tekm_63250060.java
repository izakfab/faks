import java.util.Arrays;
import java.util.Scanner;
import java.math.BigInteger;

public class Tekm_63250060 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		byte tip = s.nextByte();
		byte n = s.nextByte();
		byte k = s.nextByte();
		BigInteger m = new BigInteger(s.next());
		byte[] result = tip == 1 ? kombinacije(n, k, m) : tip == 2 ? kombinacijeSPonavljanjem(n, k, m) : tip == 3 ? variacije(n, k, m) : variacijeSPonavljanjem(n, k, m);
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

	public static BigInteger stKombinacij(byte n, byte k) {
		return fakulteta(n).divide(fakulteta(k).multiply(fakulteta((byte) (n - k))));
	}

	public static BigInteger stKombinacijSPonavljanjem(byte n, byte k) {
		return fakulteta(n + k - 1).divide(fakulteta(k).multiply(fakulteta((byte) (n - 1))));
	}


	public static byte[] kombinacije(byte n, byte k, BigInteger m) {
		BigInteger vsota = BigInteger.ZERO;
		byte[] result = new byte[k];
		for (byte i = 0; i < k; i++) {
			byte j;
			if (i == 0)
				j = 1;
			else
				j = (byte) (result[i - 1] + 1);
			while (vsota.add(stKombinacij((byte) (n - j), (byte) (k - i - 1))).compareTo(m) < 0) {
    			vsota = vsota.add(stKombinacij((byte) (n - j), (byte) (k - i - 1)));
				j++;
			}
			result[i] = j;
		}
		return result;
	}

	public static byte[] kombinacijeSPonavljanjem(byte n, byte k, BigInteger m) {
		BigInteger vsota = BigInteger.ZERO;
		byte[] result = new byte[k];
		for (byte i = 0; i < k; i++) {
			byte j;
			if (i == 0)
				j = 1;
			else
				j = (byte) (result[i - 1]);
			while (vsota.add(stKombinacijSPonavljanjem((byte) (n - j + 1), (byte) (k - i - 1))).compareTo(m) < 0) {
				vsota = vsota.add(stKombinacijSPonavljanjem((byte) (n - j + 1), (byte) (k - i - 1)));
				j++;
			}
			result[i] = j;
		}
		return result;
	}

	public static byte[] variacije(byte n, byte k, BigInteger m) {
		byte[] result = new byte[k];
		BigInteger mod = m;
		for (byte i = 0; i < k; i++) {
			BigInteger[] deljenjeInMod = mod.divideAndRemainder(fakulteta(n - i - 1).divide(fakulteta(n - k)));
			deljenjeInMod[0] = deljenjeInMod[1].compareTo(BigInteger.ZERO) == 0 ? deljenjeInMod[0] : deljenjeInMod[0].add(BigInteger.ONE);
			deljenjeInMod[1] = deljenjeInMod[1].compareTo(BigInteger.ZERO) == 0 ? fakulteta(n - i - 1).divide(fakulteta(n - k)) : deljenjeInMod[1];
			result[i] = deljenjeInMod[0].byteValue();
			mod = deljenjeInMod[1];
		}

		for (int i = 0; i < k; i++) {
			byte[] sorted = Arrays.copyOf(result, i);
			Arrays.sort(sorted);
			for (int j = 0; j < i; j++) {
				result[i] = result[i] >= sorted[j] ? (byte) (result[i] + 1) : result[i];
			}

		}
		return result;
	}

	public static byte[] variacijeSPonavljanjem(byte n, byte k, BigInteger m) {
		byte[] result = new byte[k];
		for (byte i = 1; i <= k; i++) {
			BigInteger[] deljenje = m.divideAndRemainder(BigInteger.valueOf(n).pow(k -i));
			BigInteger ceil = deljenje[1].compareTo(BigInteger.ZERO) == 0 ? deljenje[0] : deljenje[0].add(BigInteger.ONE);
			byte moduloZn = ceil.mod(BigInteger.valueOf(n)).byteValue();
			result[i - 1] = moduloZn == 0 ? n : moduloZn;
		}
		return result;
	}
}

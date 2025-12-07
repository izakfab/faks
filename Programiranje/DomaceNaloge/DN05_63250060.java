import java.util.Scanner;

public class DN05_63250060 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int[] stolpci = new int[2004];

		int stevilo = s.nextInt();

		for (int i = 0; i < stevilo; i++) {
			int oblika = s.nextInt();
			int lokacija = s.nextInt() + 1000;
			
			int zamik = calcShift(stolpci, lokacija, oblika);
			vstavi(stolpci, lokacija, zamik, oblika);
		}
		s.close();
		izpis(stolpci);
	}

	public static void izpis(int[] tab) {
		for (int i = 0; i < tab.length; i++) {
			if (tab[i] != 0)
			System.out.println((i - 1000) + ": " + tab[i]);
		}
	}

	public static int calcShift(int[] t, int x, int o) {
		if (o == 0) {
			return Math.max(Math.max(Math.max(t[x], t[x + 1]) , t[x + 2]) , t[x+3]);
		} if (o == 1) {
			return x;
		} if (o == 2) {
			return Math.max(t[x], t[x + 1]);
		} if (o == 3) {
			return Math.max(Math.max(t[x], t[x + 1]) , t[x + 2]);
		} if (o == 4) {
			return Math.max(t[x] - 1, t[x + 1]);
		} if (o == 5) {
			return Math.max(Math.max(t[x] - 1, t[x + 1]), t[x + 2] - 1);
		} if (o == 6) {
			return Math.max(t[x], t[x + 1] - 1);
		} if (o == 7) {
			return Math.max(t[x], t[x + 1]);
		} if (o == 8) {
			return Math.max(Math.max(t[x], t[x + 1]), t[x + 2]);
		} if (o == 9) {
			return Math.max(t[x] - 2, t[x + 1]);
		} if (o == 10) {
			return Math.max(Math.max(t[x], t[x + 1] - 1), t[x + 2] - 1);
		} if (o == 11) {
			return Math.max(t[x], t[x + 1]);
		} if (o == 12) {
			return Math.max(Math.max(t[x] - 1, t[x + 1] - 1), t[x + 2]);
		} if (o == 13) {
			return Math.max(t[x], t[x + 1] - 2);
		} if (o == 14) {
			return Math.max(Math.max(t[x], t[x + 1]), t[x + 2]);
		} if (o == 15) {
			return Math.max(Math.max(t[x] - 1, t[x + 1]), t[x + 2]);
		} if (o == 16) {
			return Math.max(t[x], t[x + 1] - 1);
		} if (o == 17) {
			return Math.max(Math.max(t[x], t[x + 1]), t[x + 2] - 1);
		}
		return Math.max(t[x] - 1, t[x + 1]);
	}

	public static void vstavi(int[] t, int x, int z, int o) {
		if (o == 0) {
			t[x] = z + 1;
			t[x + 1] = z + 1;
			t[x + 2] = z + 1;
			t[x + 3] = z + 1;
			return;
		} if (o == 1) {
			t[x] = z + 4;
			return;
		} if (o == 2) {
			t[x] = z + 2;
			t[x + 1] = z + 2;
			return;
		} if (o == 3) {
			t[x] = z + 1;
			t[x + 1] = z + 2;
			t[x + 2] = z + 1;
			return;
		} if (o == 4) {
			t[x] = z + 2;
			t[x + 1] = z + 3;
			return;
		} if (o == 5) {
			t[x] = z + 2;
			t[x + 1] = z + 2;
			t[x + 2] = z + 2;
			return;
		} if (o == 6) {
			t[x] = z + 3;
			t[x + 1] = z + 2;
			return;
		} if (o == 7) {
			t[x] = z + 3;
			t[x + 1] = z + 1;
			return;
		} if (o == 8) {
			t[x] = z + 1;
			t[x + 1] = z + 1;
			t[x + 2] = z + 2;
			return;
		} if (o == 9) {
			t[x] = z + 3;
			t[x + 1] = z + 3;
			return;
		} if (o == 10) {
			t[x] = z + 2;
			t[x + 1] = z + 2;
			t[x + 2] = z + 2;
			return;
		} if (o == 11) {
			t[x] = z + 1;
			t[x + 1] = z + 3;
			return;
		} if (o == 12) {
			t[x] = z + 2;
			t[x + 1] = z + 2;
			t[x + 2] = z + 2;
			return;
		} if (o == 13){
			t[x] = z + 3;
			t[x + 1] = z + 3;
			return;
		} if (o == 14) {
			t[x] = z + 2;
			t[x + 1] = z + 1;
			t[x + 2] = z + 1;
			return;
		} if (o == 15) {
			t[x] = z + 2;
			t[x + 1] = z + 2;
			t[x + 2] = z + 1;
			return;
		} if (o == 16) {
			t[x] = z + 2;
			t[x + 1] = z + 3;
			return;
		} if (o == 17) {
			t[x] = z + 1;
			t[x + 1] = z + 2;
			t[x + 2] = z + 2;
			return;
		}
		t[x] = z + 3;
		t[x + 1] = z + 2;
	}
}

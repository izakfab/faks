
/*
Samodejno testiranje:

tj.exe Prva.java . .

Javni testni primeri:

01: primer iz besedila
02--06: k = n
01, 07--10: splo"sni primeri
*/

import java.util.*;

public class Prva {

    public static void main(String[] args) {
        // dopolnite ...

		Scanner s = new Scanner(System.in);
		int k =	s.nextInt();
		int[] tab = new int[k];
		int count = 0;
		int sum = 0;

		while (s.hasNextInt()) {
			tab[count % k] = s.nextInt();
			if (count % k == k - 1) {
				sum += sestej(tab);
				tab = new int[k];
			}
			count++;
		}
		sum += sestej(tab);
		System.out.println(sum);
    }

    // pomo"zne metode, notranji razredi (po potrebi) ...
	static int sestej(int[] tab) {
		int min = tab[0];
		int sum = 0;
		for (int cena : tab) {
			sum += cena;
			min = cena < min ? cena : min;
		}
		return sum - min;
	}
}

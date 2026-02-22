
/*
Samodejno testiranje:

tj.exe

Javni testni primeri:

01: primer iz besedila
02--06: visina = 1
01, 07--10: splo"sni primeri
*/

import java.util.*;

public class Cetrta {

    public static Iterator<String> piramidator(int visina, int odmik) {

		// popravite / dopolnite ...
		List<String> piramida = new ArrayList<String>();
		for (int i = 0; i < visina; i++) {
			for (int j = 0; j < odmik; j++) {
				piramida.add("-");
			}
			for (int j = 1; j < visina - i; j++) {
				piramida.add("-");
			}
			for (int j = 0; j < i*2+1; j++) {
				piramida.add("*");
			}
			piramida.add(String.format("%n"));
		}
        return piramida.iterator();
    }

    // pomo"zne metode, notranji razredi (po potrebi) ...
}

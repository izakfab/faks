
/*

Prevajanje in poganjanje:

gcc -o test01 test01.c tranzitivnost.c -lm
./test01

*/

#include <stdio.h>
#include <stdbool.h>

#include "tranzitivnost.h"

int tranzitivnost(int a, int b) {
    // popravite / dopolnite ...
	bool tranzitivna = true;
	bool antitranzitivna = true;

	for (int x = a; x <=b; x++) {
		for (int y = a; y <= b; y++) {
			for (int z = a; z <= b; z++) {
				if (f(x, y) == 1 && f(y, z) == 1) {
					if (f(x, z) == 1) {
						antitranzitivna = false;
					} else {
						tranzitivna = false;
					}
				}
			}
		}
	}
	if (tranzitivna) {
		if (antitranzitivna)
			return 1;
		else
			return 2;
	} else {
		if (antitranzitivna)
			return 3;
		else
			return 4;
	}
}

// Ta datoteka NE SME vsebovati funkcij main in f!
// Funkciji main in f sta definirani v datoteki test01.c.


/*

Prevajanje in poganjanje:

gcc -o test01 test01.c inverz.c -lm
./test01

*/

#include <stdio.h>
#include <stdbool.h>

#include "inverz.h"

long inverz(long x, long a, long b) {
    // popravite / dopolnite ...
	long res = 0;
	res = (a + b) / 2;

	while (x != f(res)) {
		if (f(res) > x) {
			b = res - 1;
		} else {
			a = res + 1;
		}
		res = (a + b) / 2;
	}
    return res;
}

// Ta datoteka NE SME vsebovati funkcij main in f!
// Funkciji main in f sta definirani v datoteki test01.c.

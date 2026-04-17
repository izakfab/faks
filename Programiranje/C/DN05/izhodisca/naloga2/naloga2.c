/*

Prevajanje in poganjanje skupaj z datoteko test01.c:

gcc -D=test test01.c naloga2.c
./a.out


*/

#include <stdio.h>
#include <stdlib.h>

#include "naloga2.h"

void zamenjaj(int** a, int** b) {
	int* temp = *a;
	*a = *b;
	*b = temp;
}

void uredi(int** a, int** b, int** c) {
	// a b c
	// a c b
	// c a b
	// b a c
	// b c a
	// c b a
	if (**b > **a) {
		if (**b > **c) {
			if (**c > **a) { // a c b
				zamenjaj(b, c);
			 } else { // c a b
				zamenjaj(a, c);
				zamenjaj(b, c);
			}
		} else {} // a b c
	} else if (**a > **c) {
		if (**c > **b) { // b c a
			zamenjaj(a, b);
			zamenjaj(b, c);
		} else { // c b a
			zamenjaj(a, c);
		}
	} else { // c a b
		zamenjaj(a, c);
		zamenjaj(b, c);
	}
}

#ifndef test

int main() {
    // koda za ro"cno testiranje (po "zelji)
	int* a = (int*) malloc(sizeof(int));
	int* b = (int*) malloc(sizeof(int));
	*a = 1;
	*b = 2;
	printf("a:%d b:%d\n", *a, *b);
	zamenjaj(&a, &b);
	printf("a:%d b:%d\n", *a, *b);
    return 0;
}

#endif

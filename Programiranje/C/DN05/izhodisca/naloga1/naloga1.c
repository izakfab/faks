
/*

Prevajanje in poganjanje skupaj z datoteko test01.c

gcc -D=test test01.c naloga1.c
./a.out

*/

#include <stdio.h>
#include <stdlib.h>

#include "naloga1.h"

int* poisci(int* t, int* dolzina, int** konec) {
	int* start = t;
	while (*start != 0)
		start--;
	start++;
	while (*t != 0)
		t++;
	t--;
	*konec = t;
	*dolzina = *konec - start + 1;
    return start;
}

#ifndef test

int main() {
    // koda za ro"cno testiranje (po "zelji)
	int sken = 0;
	scanf("%d", &sken);
	int* nums = (int*) malloc(sken * sizeof(int));
	for (int i = 0; i < sken; i++) {
		scanf("%d", &nums[i]);
	}
	scanf("%d", &sken);
	int* konec = (int*) malloc(sizeof(int*));
	int dolzina = 0;
	int* start = poisci(nums + sken, &dolzina, &konec);
	printf("nums:%p\nzacetek:%p  konec:%p\ndolzina:%d\n", nums, start, konec, dolzina);
    return 0;
}

#endif

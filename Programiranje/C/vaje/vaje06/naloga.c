#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>

#include "naloga.h"

int steviloZnakov(char* niz, char znak) {
    // popravite / dopolnite ...
	int count = 0;
	while (*niz != '\0') {
		if (*niz == znak) count++;
		niz++;
	}
	return count;
}

char* kopirajDoZnaka(char* niz, char znak) {
    // popravite / dopolnite ...
	int length = 0;
	while (*niz != znak && *niz != '\0') {
		length++;
		niz++;
	}
	niz -= length;

	char* nov = (char*) malloc(length * sizeof(char));
	for (int i = 0; i < length; i++) {
		nov[i] = niz[i];
	}
	nov[length] = '\0';
    return nov;
}

char** razcleni(char* niz, char locilo, int* stOdsekov) {
    // popravite / dopolnite ...
	*stOdsekov = steviloZnakov(niz, locilo) + 1;
	int length = 0;
	int* zacetki = (int*) calloc(*stOdsekov, sizeof(int));
	int count = 1;
	while (*niz != '\0') {
		if (count < *stOdsekov && *niz == locilo) {
			zacetki[count] = length + 1;
			count++;
		}
		length++;
		niz++;
	}
	niz -= length;
	for (int i = 0; i < *stOdsekov; i++) {
		// printf("%d ", zacetki[i]);
	}
	// printf("\n%d\n", length);

	char** rez = calloc(length, sizeof(char));
	for(int i = 0; i < *stOdsekov; i++) {
		printf("\n%s", kopirajDoZnaka(niz + zacetki[i], locilo));
		rez[i] = kopirajDoZnaka(niz + zacetki[i], locilo);
	}
	// printf("\n");
    return rez;
}

#ifndef test

void pozeni(char* niz, char locilo) {
    int stOdsekov = 0;
    char** odseki = razcleni(niz, locilo, &stOdsekov);
    for (int i = 0;  i < stOdsekov;  i++) {
        printf("%d: <%s>\n", i + 1, odseki[i]);
        free(odseki[i]);
    }
    free(odseki);
}

int main() {
    char* niz = "prijazen niz z enim samim presledkom med besedami";
    // pozeni(niz, ' ');
	int x = 0;
	char** odseki = razcleni(niz, ' ', &x);

    exit(0);
    return 0;
}

#endif

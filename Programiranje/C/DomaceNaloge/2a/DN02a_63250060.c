#include <stdbool.h>
#include <stdio.h>
int main() {
	char prebrano = 0;
	do {
		prebrano = getchar();
		int izpis = '1';
		bool prvi = true;
		bool zacetek0 = false;
		while (prebrano != ' ' && prebrano != '\n') {
			if (prebrano < '0' || prebrano > '9' || zacetek0)
				izpis = '0';
			if (prvi && prebrano == '0')
				zacetek0 = true;
			prvi = false;
			prebrano = getchar();
		}
		putchar(izpis);
	} while (prebrano != '\n');
	putchar('\n');
	return 0;
}

#include <stdio.h>
#include <stdbool.h>

int main() {
	char prebrano = 0;

	do {
		bool desetisko = true;
		bool osmisko = true;
		bool hex = true;
		bool bin = true;

		int izpis = '0';
		bool prvi = true;
		bool zacetek0 = false;
		int dolzina = 0;

		prebrano = getchar();
		while (prebrano != ' ' && prebrano != '\n') {
			if (prebrano < '0' || prebrano > '9' || zacetek0)
				desetisko = false;
			if (prvi && prebrano == '0')
				zacetek0 = true;
			if (prebrano < '0' || prebrano > '7')
				osmisko = false;
			if (!zacetek0 || (dolzina == 1 && prebrano != 'x'))
				hex = false;
			if (dolzina > 2 && !(prebrano >= '0' && prebrano <= '9' || prebrano >= 'A' && prebrano <= 'F'))
				hex = false;
			if (!zacetek0 || (dolzina == 1 && prebrano != 'b'))
				bin = false;
			if (dolzina > 2 && !(prebrano >= '0' && prebrano <= '1'))
				bin = false;
			dolzina++;
			prebrano = getchar();
		}
		if (dolzina <= 2) {
			hex = false;
			bin = false;
		}
		if (desetisko || osmisko || hex || bin)
			izpis = '1';
		// printf(" desetisko:%b osmisko:%b hex:%b bin:%b\n", desetisko, osmisko, hex, bin);
		putchar(izpis);
	} while (prebrano != '\n');
	putchar('\n');
	return 0;
}

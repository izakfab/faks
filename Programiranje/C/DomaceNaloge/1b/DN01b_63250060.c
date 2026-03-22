#include <stdio.h>

void printInt(int x) {
	if (x / 10 == 0) {
		putchar(x + '0');
	} else {
		printInt(x / 10);
		putchar(x % 10 + '0');
	}

}

int main() {
	char i = getchar();
	int count = 0;


	while (i != '\n') {
		if (i != '0' && i != '1')
			return -1;

		if (count > 0)
			count++;

		if (i == '1' && count == 0)
			count = 1;

		i = getchar();
	}
	printInt(count);
	putchar('\n');
	return 0;
}

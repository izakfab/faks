#include <stdio.h>
#include <stdbool.h>

void printInt(int);
int readInt(char);

void printInt(int x) {
	if (x / 10 == 0) {
		if (x < 0)
			putchar('-');
		putchar(x + '0');
	} else {
		printInt(x / 10);
		putchar(x % 10 + '0');
	}

}

int readInt(char endChar) {
	int x = 0;
	bool positive = true;
	char i = getchar();
	while (i != endChar) {
		if (i == '-')
			positive = false;
		else
			x = x * 10 + i -'0';
		i = getchar();
	}

	if (!positive)
		x = -x;
	return x;
}

int main() {
	int x = readInt(' ');

	int y = readInt('\n');

	int sum = x + y;
	if (sum < 0) {
		putchar('-');
		sum = -sum;
	}
	printInt(sum);
	putchar('\n');

	return 0;
}

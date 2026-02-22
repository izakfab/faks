#include <stdio.h>
#include <stdbool.h>

int readint() {
	int c; int i = 0;
	while (true) {
		c = getchar();
		if (('0' <= c) && ('9' >= c)) {
			i *= 10;
			i += c - '0';
		} else {
			break;
		}
	}
	return i;
}

int main() {
	int i;
	i = readint();
	printf("int = %d\n", i);
	return 0;
}



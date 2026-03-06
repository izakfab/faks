#include <stdio.h>
#include <stdbool.h>

int isprime(int n) {
	if (n == 2) return 1;
	if (n % 2 == 0 || n <= 1) return 0;
	for (int i = 3; i * i <= n; i += 2)
		if (n % i == 0) return 0;
	return 1;
}

int main() {
	for (int i = 1; i <= 100; i++)
		if (isprime(i)) printf("%d ", i);
	printf("\n");
	return 0;
}

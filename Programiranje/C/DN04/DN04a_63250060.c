#include <stdio.h>
#include <stdlib.h>

int main() {
	int n = 0;
	scanf("%d", &n);
	int* arr = (int*) malloc(2 * n * sizeof(int));
	int* arr2 = (int*) malloc(2 * n * sizeof(int));
	int rez = -1;

	for (int i = 0; i < n; i++) {
		int x = 0;
		scanf("%d", &x);
		*(arr + i) = x;
		*(arr + n + i) = x;
	}

	for (int i = 0; i < n; i++) {
		int x = 0;
		scanf("%d", &x);
		*(arr2 + i) = x;
	}

	for (int i = 0; i < n && rez == -1; i++) {
		int praviI = 1;
		for (int j = 0; j < n && praviI == 1; j++) {
			if (*(arr + i + j) != *(arr2 + j)) {
				praviI = 0;
			}
		}
		if (praviI == 1)
			rez = i;
	}

	free(arr);
	free(arr2);

	printf("%d\n", rez);
	return 0;
}

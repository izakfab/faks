#include <stdio.h>
#include <stdlib.h>

int main() {
	int n = 0;
	int k = 0;
	scanf("%d %d", &n, &k);
	int* arr = (int*) malloc(n * sizeof(int));
	int steviloParov = 0;

	for (int i = 0; i < n; i++) {
		scanf("%d", arr + i);
	}

	for (int i = 0; i < n - 1; i++) {
		for (int j = i + 1; j < n; j++) {
			if (*(arr + i) + *(arr + j) == k)
				steviloParov++;
		}
	}

	free(arr);

	printf("%d\n", steviloParov);
	return 0;
}

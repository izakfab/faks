#include <stdio.h>
#include <stdlib.h>

int main() {
	int* arr;
	arr = (int*) malloc(5 * sizeof(int));
	arr[2] = 69;
	printf("%d\n", 2[arr]);
	return 0;
}

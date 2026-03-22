
#include <stdio.h>
#include <stdbool.h>
#include "tranzitivnost.h"
#include <limits.h>

bool f(int x, int y) {
    return (1 == x % y);
}

int main() {
    printf("%d\n", tranzitivnost(1, 1000));   // 2
    return 0;
}

#pragma warning(disable:4996)
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <limits.h>
#include <math.h>

void hanoi(int n, int from, int aux, int to);
int main() {
	int n;

	scanf("%d", &n);

	printf("%d\n", (int)pow(2,n)-1);
	hanoi(n, 1, 2, 3);

	return 0;
}
void hanoi(int n, int from, int aux, int to) {

	if (n == 1) {
		printf("%d %d\n", from, to);
		return;
	}

	hanoi(n - 1, from, to, aux);
	printf("%d %d\n", from, to);
	hanoi(n - 1, aux, from, to);
}
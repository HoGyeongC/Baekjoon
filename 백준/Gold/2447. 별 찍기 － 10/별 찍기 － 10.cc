#pragma warning(disable:4996)
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <limits.h>

void star(int i, int j, int num);
int main() {
	int i, j, num;

	scanf("%d", &num);

	for (i = 0; i < num; i++) {
		for (j = 0; j < num; j++)
			star(i, j, num);
		printf("\n");
	}


	return 0;
}
void star(int i, int j, int num) {

	if ((i / num) % 3 == 1 && (j / num) % 3 == 1) {
		printf(" ");
	}
	else {
		if (num / 3 == 0)
			printf("*");
		else
			star(i, j, num / 3);
	}
	return;

}
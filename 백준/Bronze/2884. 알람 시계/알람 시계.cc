#pragma warning(disable:4996)
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <limits.h>

int main() {
	int h, m;

	scanf("%d %d", &h, &m);

	if (m < 45) {
		m += 60;
		if (h < 1) {
			h = 24;
		}
		h -= 1;
	}
	m -= 45;
	printf("%d %d", h, m);


	return 0;
}
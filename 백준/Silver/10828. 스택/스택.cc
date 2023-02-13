#pragma warning(disable:4996)
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <limits.h>

typedef struct node {
	struct node *next;
	int elem;
}NODE;
NODE *getnode();
void push(NODE *top, int elem);
int pop(NODE *top);
int size(NODE *top);
int emptyStack(NODE *top);
int topS(NODE *top);
int main() {
	NODE *top;
	int N, i, e;
	char method[6];

	top = getnode();
	scanf("%d", &N);
	for (i = 0; i < N; i++) {
		scanf("%s", method);
		if (strcmp("push", method) == 0) {
			scanf("%d", &e); getchar();
			push(top, e);
		}
		else if (strcmp("pop", method) == 0) {
			printf("%d\n", pop(top));
		}
		else if (strcmp("size", method) == 0) {
			printf("%d\n", size(top));
		}
		else if (strcmp("empty", method) == 0) {
			printf("%d\n", emptyStack(top));
		}
		else if (strcmp("top", method) == 0) {
			printf("%d\n", topS(top));
		}
	}

	return 0;
}
NODE *getnode() {
	NODE *nn = NULL;

	nn = (NODE*)malloc(sizeof(NODE));
	if (nn == NULL) {
		printf("not enough memory");
	}
	nn-> next = NULL;

	return nn;
}
void push(NODE *top, int elem) {
	NODE *p;

	p = getnode();
	p->elem = elem;
	p->next = top->next;
	top->next = p;

	return;
}
int pop(NODE *top) {
	NODE *p;
	int e;

	if (top->next == NULL)
		return -1;

	p = top->next;
	top->next = p->next;
	e = p->elem;
	free(p);

	return e;
}
int size(NODE *top) {
	NODE *p;
	int s = 0;

	p = top;
	while (p->next != NULL) {
		s += 1;
		p = p->next;
	}
	return s;
}
int emptyStack(NODE *top) {
	return top->next == NULL;
}
int topS(NODE *top) {
	if (top->next == NULL)
		return -1;
	else
		return top->next->elem;
}
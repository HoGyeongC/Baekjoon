#pragma warning(disable:4996)
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <limits.h>

typedef struct node {
	struct node *next, *prev;
	int elem;
}NODE;
NODE *getnode();
void push(NODE *rear, int elem, int *s);
int pop(NODE *top, int *s);
int size(NODE *top, NODE *rear);
int empty(NODE *top, NODE *rear);
int front(NODE *top);
int back(NODE *rear);
int main() {
	NODE *top, *rear;
	int i, N, e, s = 0;
	char method[6];

	top = getnode();
	rear = getnode();
	top->next = rear;
	rear->prev = top;

	scanf("%d", &N);
	for (i = 0; i < N; i++) {
		scanf("%s", method);
		if (strcmp("push", method) == 0) {
			scanf("%d", &e); getchar();
			push(rear, e, &s);
		}
		else if (strcmp("pop", method) == 0) {
			printf("%d\n", pop(top, &s));
		}
		else if (strcmp("size", method) == 0) {
			printf("%d\n", s);
		}
		else if (strcmp("empty", method) == 0) {
			printf("%d\n", empty(top, rear));
		}
		else if (strcmp("front", method) == 0) {
			printf("%d\n", front(top));
		}
		else if (strcmp("back", method) == 0) {
			printf("%d\n", back(rear));
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
	nn->next = NULL;
	nn->prev = NULL;
	nn->elem = -1;
	return nn;
}
void push(NODE *rear, int elem, int *s) {
	NODE *p;

	p = getnode();
	p->elem = elem;

	rear->prev->next = p;
	p->prev = rear->prev;
	rear->prev = p;
	p->next = rear;
	(*s) += 1;

	return;
}
int pop(NODE *top, int *s) {
	NODE *p;
	int e;

	p = top->next;
	if (p->elem == -1)
		return -1;
	
	top->next = p->next;
	p->next->prev = top;
	e = p->elem;
	free(p);
	(*s) -= 1;
	return e;
}
int size(NODE *top, NODE *rear) {
	NODE *p;
	int s = 0;

	for (p = top->next; p != rear; p = p->next) {
		s += 1;
	}
	return s;
}
int empty(NODE *top, NODE *rear) {
	return top->next == rear;
}
int front(NODE *top) {
	return top->next->elem;
}
int back(NODE *rear) {
	return rear->prev->elem;
}
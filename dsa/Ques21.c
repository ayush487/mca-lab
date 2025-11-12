// Q21: Write a C program to swap two numbers using a call-by-reference function.

#include <stdio.h>

void swap(int *pA, int *pB) {
  int temp = *pA;
  *pA = *pB;
  *pB = temp;
}

int main() {
  int a,b;
  printf("Enter A : ");
  scanf("%d", &a);
  printf("Enter B : ");
  scanf("%d", &b);
  printf("Before Swapping A : %d B : %d\n", a, b);
  swap(&a,&b);
  printf("After Swapping A : %d B : %d\n", a, b);
  return 0;
}
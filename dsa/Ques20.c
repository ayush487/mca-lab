// Q20: Write a C program to swap two numbers using a call-by-value function.

#include <stdio.h>

void swap(int a, int b) {
  int temp = a;
  a = b;
  b = temp;
  printf("Inside Swap A : %d and B : %d\n", a, b);
}

int main() {
  int a,b;
  printf("Enter A : ");
  scanf("%d", &a);
  printf("Enter B : ");
  scanf("%d", &b);
  printf("Before Swapping A : %d B : %d\n", a, b);
  swap(a,b);
  printf("After Swapping A : %d B : %d\n", a, b);
  return 0;
}
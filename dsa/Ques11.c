// Q11: Write a C program to print the Fibonacci series up to N terms using recursion.

#include <stdio.h>

int fibonacci(int a) {
  if (a==0) return 0;
  else if (a==1) return 1;
  else return fibonacci(a-2) + fibonacci(a-1);
}

int main() {
  int n;
  printf("Enter a number : ");
  scanf("%d", &n);
  for (int i=0;i<n;i++) 
  printf("%d\t", fibonacci(i));
  return 0;
}
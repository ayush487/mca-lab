// Q6: Write a C program to find the greater of two numbers without using if statement.

#include <stdio.h>

int main() {
  int a,b;
  printf("Enter 2 numbers : \n");
  scanf("%d %d", &a, &b);
  int g = a > b ? a : b;
  printf("Greater Number is %d", g);
  return 1;
}
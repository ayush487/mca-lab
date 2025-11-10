// Q9: Write a program to reverse the digits of a given number.

#include <stdio.h>

int main() {
  int n;
  int r = 0;
  printf("Enter a number you want to reverse : ");
  scanf("%d", &n);
  while (n>0) 
  {
    r = r*10 + (n%10);
    n/=10;
  }
  printf("Reversed of the given number is %d", r);
  return 0;
}
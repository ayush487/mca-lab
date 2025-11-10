// Q13: Write a C program to check whether a given number is a palindrome or not.

#include <stdio.h>

int reverse(int n) {
  int r = 0;
  while (n>0) 
  {
    r = r*10 + (n%10);
    n/=10;
  }
  return r;
}

int main() {
  int n;
  printf("Enter a number : ");
  scanf("%d", &n);
  int r = reverse(n);
  if (n==r) printf("%d is a Palindrome Number", n);
  else printf("%d is not a Palindrome Number", n);
  return 0;
}
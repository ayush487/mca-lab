// Q12: Write a program to check whether a given number is prime or not.

#include <stdio.h>

int main() {
  int n;
  int isPrime = 1;
  printf("Enter a number : \n");
  scanf("%d", &n);
  for (int i=2;i<=n/2;i++) {
    if (n%i==0)  {
      isPrime = 0;
      break;
    }
  }
  if (isPrime) {
    printf("%d is a Prime Number\n", n);
  } else {
    printf("%d is not a Prime Number\n", n);
  }
  return 0;
}
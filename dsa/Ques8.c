
// Q8: Write a program to calculate the sum of the first N natural numbers.

#include <stdio.h>

int main() {
  int n;
  int sum = 0;
  printf("Enter a number : ");
  scanf("%d", &n);
  for (int i=1;i<=n;i++) {
    sum+=i;
  }
  printf("Sum of first %d natural numbers is %d", n, sum);
  return 0;
}
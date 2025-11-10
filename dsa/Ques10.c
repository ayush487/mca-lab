// Q10: Write a program to print the Fibonacci series up to N terms.

#include <stdio.h>

int main()
{
  int first, second, next, n;
  printf("Enter a number : ");
  scanf("%d", &n);
  first = 0;
  second = 1;
  for (int i = 1; i <= n; i++)
  {
    if (i==1) {
      printf("%d\t", first);
    } else if (i==2) {
      printf("%d\t", second);
    } else {
      next = first+second;
      printf("%d\t", next);
      first = second;
      second = next;
    }
  }
  return 0;
}
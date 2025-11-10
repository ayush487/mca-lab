// Q15: Write a program to generate Pascal’s Triangle.

#include <stdio.h>

int factorial(int a) {
  if (a==0 || a==1) return 1;
  else return a * factorial(a-1);
}

int nCr(int n, int r) {
  int fN = factorial(n);
  int fR = factorial(r);
  int fNR = factorial(n-r);
  return fN/(fR * fNR);
}

int main() {
  int n;
  printf("Enter number of rows : ");
  scanf("%d", &n);
  
  printf("Pascal's Triangle\n");
  for (int i=0;i<n;i++) {
    for (int j=0;j<n-i;j++) {
      printf("  ");
    }
    for (int j=0;j<=i;j++) {
      int num = nCr(i,j);
      printf("%4d", num);
    }
    printf("\n");
  }
  return 0;
}
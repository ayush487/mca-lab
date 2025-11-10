/*
Q4: Write a C program that takes input from the user and performs the following operations in one program:
    Subtract AND assignment (-=)
    Multiply AND assignment (*=)
    Divide AND assignment (/=)
    Modulus AND assignment (%=)
    Bitwise AND assignment (&=)
    Bitwise OR assignment (|=)
    Bitwise XOR assignment (^=)
    Right shift assignment (>>=)
    Left shift assignment (<<=)
    Logical AND (&&)
    Logical OR (||)
*/

#include <stdio.h>

int main() {
  int a, b;
  printf("Enter Number 1 : ");
  scanf("%d", &a);
  printf("Enter Number 2 : ");
  scanf("%d", &b);

  printf("Subtract AND assignment (-=)\n");
  a-=b;
  printf("A and B : %d , %d\n", a, b);

  printf("Multiply AND assignment (*=)\n");
  a*=b;
  printf("A and B : %d , %d\n", a, b);

  printf("Divide AND assignment (/=)\n");
  a/=b;
  printf("A and B : %d , %d\n", a, b);

  printf("Modulus AND assignment (%%=)\n");
  a%=b;
  printf("A and B : %d , %d\n", a, b);

  printf("Time for some bit manipulation\n");
  printf("Enter Number 1 : ");
  scanf("%d", &a);
  printf("Enter Number 2 : ");
  scanf("%d", &b);

  printf("Bitwise AND assignment (&=)\n");
  a&=b;
  printf("A and B : %d , %d\n", a, b);
  
  printf("Bitwise OR assignment (|=)\n");
  a|=b;
  printf("A and B : %d , %d\n", a, b);

  printf("Bitwise XOR assignment (^=)\n");
  a^=b;
  printf("A and B : %d , %d\n", a, b);

  printf("Right shift assignment (>>=)\n");
  a>>=b;
  printf("A and B : %d , %d\n", a, b);

  printf("Left shift assignment (<<=)\n");
  a<<=b;
  printf("A and B : %d , %d\n", a, b);

  printf("Logical AND (&&)\n");
  int x = a&&b;
  printf("X : %d\n", x);

  printf("Logical OR (||)\n");
  int y = a||b;
  printf("Y : %d\n", y);

  return 0;
}
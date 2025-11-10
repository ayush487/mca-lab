// Q2: Write a C program to calculate the Area of a Rectangle.

#include <stdio.h>

int main() {
  int length, breadth;
  printf("Enter length of rectangle : \n");
  scanf("%d", &length);
  printf("Enter breadth of rectangle : \n");
  scanf("%d", &breadth);
  int area = length * breadth;
  printf("Area of Rectangle is %d\n", area);
  return 0;
}
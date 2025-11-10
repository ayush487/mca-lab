// Q3: Write a C program to calculate the area and volume of a sphere, where the radius is entered by the user.

#include <stdio.h>

int main() {
  int radius;
  float area, volume;
  printf("Enter radius of Sphere :\n");
  scanf("%d", &radius);
  area = 4 * 3.14 * radius * radius;
  volume =  4 * 3.14 * radius * radius * radius / 3;
  printf("Surface Area of Sphere is %f\n", area);
  printf("Volume of Sphere is %f\n", volume);
  return 0;
}
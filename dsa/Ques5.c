// Q5: Write a C program that takes an integer input from the user and displays the coresponding day of the week using a switch statement.

#include <stdio.h>
#include <string.h>

int main() {
  int n;
  printf("Enter Day number : ");
  scanf("%d", &n);
  char dayName[12];
  switch (n)
  {
  case 1:
    strcpy(dayName, "Monday");
    break;
  case 2:
    strcpy(dayName, "Tuesday");
    break;
  case 3 :
    strcpy(dayName, "Wednesday");
    break;
  case 4 :
    strcpy(dayName, "Thursday");
    break;
  case 5 :
    strcpy(dayName, "Friday");
    break;
  case 6 :
    strcpy(dayName, "Saturday");
    break;
  case 7 :
    strcpy(dayName, "Sunday");
    break;
  default:
    strcpy(dayName, "Invalid day number");
    break;
  }
  printf("Day: %s\n", dayName);
  return 0;
}

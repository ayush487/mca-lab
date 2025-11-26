// Q29. Write a C program to reverse a string using pointers.

#include <stdio.h>
#include <string.h>

int main() {
  char string[100], length, *start, *end, temp;
  printf("Enter a string : ");
  fgets(string, sizeof(string), stdin);
  string[strcspn(string, "\n")] = '\0';
  length = strlen(string);
  if (length == 0) {
    printf("Empty string\n");
    return 0;
  }
  start = string;
  end = string + length - 1;
  for (int i=0;i<length/2;i++) {
    temp = *start;
    *start = *end;
    *end = temp;
    start++;
    end--;
  }
  printf("%s", string);
  return 0;
}

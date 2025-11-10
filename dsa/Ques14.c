// Q14: Write a C program to check whether a given string is a palindrome or not.

#include <stdio.h>
#include <string.h>

int main() {
  char str[100];
  printf("Enter a string : ");
  scanf("%s", str);
  int len = strlen(str);
  int isPalindrome = 1;
  for (int i=0;i<len/2;i++) 
  {
    if (str[i]!=str[len - 1 -i]) {
      isPalindrome = 0;
      break;
    }
  }
  if (isPalindrome) printf("Input String is Palindrome");
  else printf("Input String is not Palindrome");
  
  return 0;
}
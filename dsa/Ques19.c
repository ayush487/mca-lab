/*
Q19: Write a C program that performs the following operations:

    Asks the user how many student names they want to store.
    Dynamically allocates an array of character pointers (one for each name).
    For each student, dynamically allocates memory for their name using malloc or calloc.
    Reads the names from the user.
    Prints all the stored names.
    Resizes the array using realloc to add 2 more students, then takes their names and prints the updated list.
*/

#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main()
{
  int n;
  char buffer[100];
  char **names; // character pointer array
  printf("Enter number of students you want to store : \n");
  scanf("%d", &n);
  getchar();
  names = malloc(n * sizeof(char *));
  if (names == NULL)
  {
    printf("Memory not allocated for Character Pointers");
    return 0;
  }
  for (int i = 0; i < n; i++)
  {
    printf("Enter Student %d Name : ", i + 1);
    fgets(buffer, sizeof(buffer), stdin);
    buffer[strcspn(buffer, "\n")] = '\0';
    // char *p = malloc(strlen(buffer) + 1);
    char *p = calloc(1, strlen(buffer) + 1);
    if (p == NULL)
    {
      printf("Memory allocation failed for Student %d Name", i + 1);
      return 0;
    }
    strcpy(p, buffer);
    names[i] = p;
  }
  printf("Student Names : \n");
  for (int i = 0; i < n; i++)
  {
    printf("%s\n", names[i]);
  }
  printf("Let's Add 2 More Students\n");
  names = realloc(names, sizeof(char *) * (n + 2));
  for (int i = 0; i < 2; i++)
  {
    printf("Enter New Student %d Name : ", i+1);
    fgets(buffer, sizeof(buffer), stdin);
    buffer[strcspn(buffer, "\n")] = '\0';
    char *p = calloc(1, strlen(buffer) + 1);
    strcpy(p, buffer);
    names[i + n] = p;
  }
  printf("Student Names : \n");
  for (int i = 0; i < n+2; i++)
  {
    printf("%s\n", names[i]);
  }
  return 0;
}
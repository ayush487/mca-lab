// Q28. Write a C program to sort an array using pointers.

#include <stdio.h>

int main() {
  int n,temp;
  printf("Enter number of elements : ");
  scanf("%d", &n);

  int arr[n];
  int *ptr = arr;
  for (int i=0;i<n;i++) {
    printf("Enter number %d : ", i+1);
    scanf("%d", ptr+i);
  }
  int isSwapped;
  for (int i=0;i<n-1;i++) {
    isSwapped = 0;
    for (int j=0;j<n-1-i;j++) {
      if (*(ptr+j) > *(ptr+j+1)) {
        int temp = *(ptr + j);
        *(ptr+j) = *(ptr + j + 1);
        *(ptr + j + 1) = temp;
        isSwapped = 1;
      }
    }
    if (!isSwapped) break;
  }

  for (int i=0;i<n;i++) {
    printf("%d ", *(ptr + i));
  }
}
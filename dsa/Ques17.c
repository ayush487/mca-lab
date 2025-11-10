// Q17: Write a program to find the second largest number from a given list of input numbers.

#include <stdio.h>
#include <limits.h>

int main() {
  int nums[] = {10,20,15,18,25,30, 349, 38};
  int size = sizeof(nums) / sizeof(nums[0]);
  int largest = nums[0];
  int secondLargest = INT_MIN;
  for (int i=1;i<size;i++) {
    if (nums[i]>=largest) {
      secondLargest = largest;
      largest = nums[i];
    } else if (nums[i] > secondLargest) {
      secondLargest = nums[i];
    }
  }
  printf("Second Largest Number in the list is %d\n", secondLargest);
  return 0;
}
// Q31. Write a program to reverse a string using a stack.

#include <stdio.h>
#include <string.h>

struct Stack
{
  int data[100];
  int count;
};

void push(struct Stack *stack, int value)
{
  if (stack->count == 100)
  {
    printf("Stack overflow\n");
    return;
  }
  stack->data[stack->count++] = value;
  // printf("Pushed %d to stack\n", value);
}

int pop(struct Stack *stack)
{
  if (stack->count == 0)
  {
    printf("Stack underflow\n");
    return -1;
  }
  return stack->data[stack->count-- - 1];
}

int peek(struct Stack *stack)
{
  if (stack->count == 0)
  {
    printf("Stack is empty\n");
    return -1;
  }
  return stack->data[stack->count - 1];
}

int main() {
  struct Stack stack;
  stack.count = 0;
  char string[100], length;
  printf("Enter a string : ");
  fgets(string, sizeof(string), stdin);
  string[strcspn(string, "\n")] = '\0';
  length = strlen(string);
  for (int i=0;i<length;i++) {
    push(&stack, (int) string[i]);
  }
  for (int i=0;i<length;i++) {
    string[i] = pop(&stack);
  }
  printf("Reversed String : %s", string);
}
// Q30. Write a program to implement a stack using an array.

#include <stdio.h>

struct Stack
{
  int data[10];
  int count;
};

void push(struct Stack *stack, int value)
{
  if (stack->count == 10)
  {
    printf("Stack overflow\n");
    return;
  }
  stack->data[stack->count++] = value;
  printf("Pushed %d to stack\n", value);
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

void displayOptions()
{
  printf("Stack Operations:\n");
  printf("1. Push\n");
  printf("2. Pop\n");
  printf("3. Peek\n");
  printf("0. Exit\n");
  printf("Enter your choice: ");
}
int main()
{
  struct Stack stack;
  stack.count = 0;
  int input, temp;
  do
  {
    displayOptions();
    scanf("%d", &input);
    switch (input)
    {
    case 1:
      printf("Enter value to push: ");
      scanf("%d", &temp);
      push(&stack, temp);
      break;
    case 2:
      temp = pop(&stack);
      printf("Popped %d from Stack\n", temp);
      break;
    case 3:
      temp = peek(&stack);
      printf("Top element is %d\n", temp);
      break;
    default:
      printf("Enter a valid input\n");
      break;
    }
  } while (input!= 0);
  return 1;
}
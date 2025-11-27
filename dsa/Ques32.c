// Q32. Write a program to evaluate a postfix expression using a stack.

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

int getSolution(char expression[]) {
  struct Stack stack;
  stack.count = 0;
  int temp1, temp2;
  int expLength = strlen(expression);
  for (int i=0;i<expLength;i++) {
    switch (expression[i])
    {
    case '+':
      temp1 = pop(&stack);
      temp2 = pop(&stack);
      push(&stack, temp2 + temp1);
      break;
    case '-':
      temp1 = pop(&stack);
      temp2 = pop(&stack);
      push(&stack, temp2 - temp1);
      break;
    case '*':
      temp1 = pop(&stack);
      temp2 = pop(&stack);
      push(&stack, temp2 * temp1);
      break;
    case '/':
      temp1 = pop(&stack);
      temp2 = pop(&stack);
      push(&stack, temp2 / temp1);
      break;
    case ' ' :
      break;
    default:
      push(&stack, expression[i] - '0');
      break;
    }
  }
  return peek(&stack);
}


int main() {
  char expression[100];
  strcpy(expression, "123*+45/-");
  int result = getSolution(expression);
  printf("Result of postfix evaluation: %d\n", result);
  return 0;
}

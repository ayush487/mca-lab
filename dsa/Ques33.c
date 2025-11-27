// Write a program to convert an infix expression to postfix expression.

#include <stdio.h>
#include <string.h>

struct Stack
{
  char data[100];
  int count;
};

void push(struct Stack *stack, char value)
{
  if (stack->count == 100)
  {
    printf("Stack overflow\n");
    return;
  }
  stack->data[stack->count++] = value;
}

char pop(struct Stack *stack)
{
  if (stack->count == 0)
  {
    printf("Stack underflow\n");
    return -1;
  }
  return stack->data[stack->count-- - 1];
}

char peek(struct Stack *stack)
{
  if (stack->count == 0)
  {
    printf("Stack is empty\n");
    return -1;
  }
  return stack->data[stack->count - 1];
}

int precedence(char op)
{
  if (op == '+' || op == '-')
    return 1;
  if (op == '*' || op == '/')
    return 2;
  return 0;
}

int main()
{
  char infixExpression[100];
  char postfixExpression[100];
  struct Stack stack;
  stack.count = 0;
  int postfixIdx = 0;
  printf("Enter a infix expression : ");
  // fgets(infixExpression, sizeof(infixExpression), stdin);
  // infixExpression[strcspn(infixExpression, "\n")] = '\0';
  scanf("%s", infixExpression);
  int expLength = strlen(infixExpression);
  for (int i = 0; i < expLength; i++)
  {
    char c = infixExpression[i];
    if (c == '(')
      push(&stack, c);
    else if (c == ')')
    {
      while (peek(&stack) != '(')
      {
        postfixExpression[postfixIdx++] = pop(&stack);
      }
      pop(&stack);
    }
    else if (c == '+' || c == '-' || c == '*' || c == '/')
    {
      while (stack.count != 0 && precedence(c) <= precedence(peek(&stack)))
      {
        postfixExpression[postfixIdx++] = pop(&stack);
      }
      push(&stack, c);
    }
    else
      postfixExpression[postfixIdx++] = c;
  }
  while (stack.count != 0)
  {
    printf("Adding %c at %d", peek(&stack), postfixIdx);
    postfixExpression[postfixIdx++] = pop(&stack);
  }
  for (int i=0;i<strlen(postfixExpression);i++) {
    printf("Character %c at %d\n", postfixExpression[i], i);
  }
  postfixExpression[postfixIdx] = '\0';
  printf("Infix Expression : %s\nPostfix Expression : %s", infixExpression, postfixExpression);
  return 0;
}

// int main()
// {
//   char infixExpression[100];
//   char postfixExpression[100];
//   int postfix_idx = 0;
//   printf("Enter an infix expression: ");
//   scanf("%s", infixExpression);
//   struct Stack stack;
//   stack.count = 0;
//   int expLength = strlen(infixExpression);
//   for (int i = 0; i < expLength; i++)
//   {
//     char currentChar = infixExpression[i];
//     if (currentChar == '(')
//     {
//       push(&stack, currentChar);
//     }
//     else if (currentChar == ')')
//     {
//       while (peek(&stack) != '(')
//       {
//         postfixExpression[postfix_idx++] = pop(&stack);
//       }
//       pop(&stack);
//     }
//     else if (currentChar == '+' || currentChar == '-' || currentChar == '*' || currentChar == '/')
//     {
//       while (stack.count != 0 && precedence(currentChar) <= precedence(peek(&stack)))
//       {
//         postfixExpression[postfix_idx++] = pop(&stack);
//       }
//       push(&stack, currentChar);
//     }
//     else
//     {
//       postfixExpression[postfix_idx++] = currentChar;
//     }
//   }
//   while (stack.count != 0)
//   {
//     postfixExpression[postfix_idx++] = pop(&stack);
//   }
//   postfixExpression[postfix_idx] = '\0';

//   printf("Postfix Expression: %s\n", postfixExpression);
//   return 0;
// }

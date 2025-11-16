// Q26: Write a C program to implement a doubly linked list with insertion, deletion, and traversal operations.

#include <stdio.h>
#include <stdlib.h>

struct Node
{
  int data;
  struct Node *next;
  struct Node *prev;
};

struct Node *head = NULL;

void insertLast()
{
  int a;
  printf("Enter number you want to insert\n");
  scanf("%d", &a);
  struct Node *newNode = (struct Node *)malloc(sizeof(struct Node));
  if (newNode == NULL)
  {
    printf("Memory Allocation Failed!\nFailed to insert %d\n", a);
    return;
  }
  newNode->data = a;
  newNode->next = NULL;
  newNode->prev = NULL;
  if (head == NULL)
  {
    head = newNode;
  }
  else
  {
    struct Node *temp = head;
    while (temp->next != NULL)
    {
      temp = temp->next;
    }
    temp->next = newNode;
    newNode->prev = temp;
  }
  printf("Node inserted\n");
}

void displayList()
{
  if (head == NULL)
  {
    printf("List is empty\n");
    return;
  }
  struct Node *temp = head;
  printf("Forward Traversal: ");
  while (temp != NULL)
  {
    if (temp->next == NULL)
    {
      printf("%d", temp->data);
      break;
    }
    printf("%d -> ", temp->data);
    temp = temp->next;
  }
  printf("\nBackward Traversal: ");
  while (temp != NULL)
  {
    printf("%d -> ", temp->data);
    temp = temp->prev;
  }
  printf("\n");
}

void deleteAny()
{
  if (head == NULL)
  {
    printf("List is empty\n");
    return;
  }
  int input;
  printf("Enter number you want to delete : ");
  scanf("%d", &input);
  struct Node *temp = head;
  int f = 0;
  while (temp != NULL)
  {
    if (temp->data == input)
    {
      f = 1;
      break;
    }
    temp = temp->next;
  }
  if (f==0) {
    printf("Element not found\n");
  } else {
    if (temp==head) {
      if (temp->next==NULL) {
        head = NULL;
      } else {
        head = temp->next; 
        head->prev = NULL;
      }
    } else {
      if (temp->next==NULL) {
        temp->prev->next = NULL;
      } else {
        temp->prev->next = temp->next;
        temp->next->prev = temp->prev;  
      }
    }
    free(temp);
    printf("Deleted Node\n");
  }
}

void displayOptions()
{
  printf("Double Linked List\n");
  printf("1. Display List\n");
  printf("2. Insert at Last\n");
  printf("3. Delete any Node\n");
  printf("0. Exit\n");
  printf("\nPlease enter your choice\n");
}

int main()
{
  displayOptions();
  int input;
  scanf("%d", &input);
  while (input)
  {
    switch (input)
    {
    case 1:
      displayList();
      break;
    case 2:
      insertLast();
      break;
    case 3:
      deleteAny();
      break;
    case 0:
      printf("\nBye\n");
      break;
    default:
      printf("\nPlease enter a valid option\n");
      break;
    }
    displayOptions();
    scanf("%d", &input);
  }
  return 0;
}
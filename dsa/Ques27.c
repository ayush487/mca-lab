// Q27: Write a C program for Circular Doubly Linked List to insert at end, delete by value, and traverse in both directions.

#include <stdio.h>
#include <stdlib.h>

struct Node
{
  int data;
  struct Node *next;
  struct Node *prev;
};

struct Node *head = NULL;

void displayOptions()
{
  printf("Double Linked List\n");
  printf("1. Display List\n");
  printf("2. Insert at Last\n");
  printf("3. Delete any Node\n");
  printf("0. Exit\n");
  printf("\nPlease enter your choice\n");
}

void displayList()
{
  if (head == NULL)
  {
    printf("List is empty\n");
    return;
  }
  struct Node *temp = head;
  printf("Forward Traversal : ");
  do
  {
    printf("%d -> ", temp->data);
    temp = temp->next;
  } while (temp != head);
  printf("\nBackward Traversal : ");
  do
  {
    temp = temp->prev;
    printf(" <- %d", temp->data);
  } while (temp != head);
  printf("\n");
}

void insertLast()
{
  struct Node *newNode = (struct Node *)malloc(sizeof(struct Node));
  if (newNode == NULL)
  {
    printf("Memory allocation failed\n");
    return;
  }
  int n;
  printf("Enter number you want to insert : ");
  scanf("%d", &n);
  newNode->data = n;
  newNode->next = NULL;
  newNode->prev = NULL;
  if (head == NULL)
  {
    head = newNode;
    head->next = head;
    head->prev = head;
    printf("New Node Inserted\n");
    return;
  }
  struct Node *temp = head->prev;
  temp->next = newNode;
  newNode->prev = temp;
  newNode->next = head;
  head->prev = newNode;
  printf("New Node Inserted\n");
}

void deleteNode()
{
  if (head == NULL)
  {
    printf("List is empty\n");
    return;
  }
  int n;
  printf("Enter number you want to delete : ");
  scanf("%d", &n);
  int f = 0;
  struct Node *temp = head;
  do
  {
    if (temp->data == n)
    {
      f = 1;
      break;
    }
    temp = temp->next;
  } while (temp != head);
  if (f == 0)
  {
    printf("Element not found\n");
    return;
  }
  else
  {
    if (temp == head)
    {
      if (head->next==head) head=NULL;
      else {
        head = head->next;
        temp->prev->next = head;
        head->prev = temp->prev;
      }
    }
    else
    {
      temp->prev->next = temp->next;
      temp->next->prev = temp->prev;
    }
    printf("Deleted required node with val %d\n", temp->data);
    free(temp);
  }
}

int main()
{
  int input;
  do
  {
    displayOptions();
    scanf("%d", &input);
    switch (input)
    {
    case 1:
      displayList();
      break;
    case 2:
      insertLast();
      break;
    case 3:
      deleteNode();
      break;
    case 0:
      break;
    default:
      printf("Invalid Input!\n");
      break;
    }
  } while (input != 0);
  return 0;
}
#include <stdio.h>
#include <stdlib.h>

struct Node
{
  int data;
  struct Node *next;
};

struct Node *head = NULL;

void insertLast(int a)
{
  struct Node *newNode = (struct Node *)malloc(sizeof(struct Node));
  if (newNode == NULL)
  {
    printf("Memory not allocated!\nFailed to insert new node\n");
    return;
  }
  newNode->data = a;
  if (head == NULL)
  {
    newNode->next = newNode;
    head = newNode;
  }
  else
  {
    struct Node *temp = head;
    while (temp->next != head)
    {
      temp = temp->next;
    }
    newNode->next = head;
    temp->next = newNode;
  }
  printf("Node inserted at last position\n");
}

void display()
{
  if (head == NULL)
  {
    printf("List is empty\n");
    return;
  }
  struct Node *temp = head;
  do {
    printf("%d\t", temp->data);
    temp = temp->next;
  } while (temp != head);

  printf("\n");
}

int main()
{
  insertLast(10);
  insertLast(20);
  insertLast(30);
  insertLast(40);
  display();
  return 0;
}
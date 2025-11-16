// Q24: Write a C program to create a singly linked list dynamically from user input and perform traversal of a given node.

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
  struct Node *newNode = (struct Node *)malloc(sizeof(struct Node *));
  if (newNode == NULL)
  {
    printf("Memory not allocated!\nFailed to insert node\n");
    return;
  }
  newNode->data = a;
  newNode->next = NULL;
  if (head == NULL)
  {
    head = newNode;
  }
  else
  {
    struct Node *temp = head;
    while (temp->next != NULL)
      temp = temp->next;
    temp->next = newNode;
  }
  printf("New Node Inserted\n");
}

void displayList()
{
  if (head == NULL)
  {
    printf("List is empty\n");
    return;
  }
  else
  {
    struct Node* temp = head;
    do
    {
      printf("%d -> ", temp->data);
      temp = temp->next;
    } while (temp!=NULL);
    printf("\n");
  }
}

void search(int s) {
  if (head==NULL) {
    printf("List is Empty\n");
    return;
  }
  struct Node *temp = head;
  int f = 0;
  while (temp!=NULL)
  {
    if (temp->data==s) {
      f = 1;
      break;
    }
    temp = temp->next;
  }
  if (f==0) {
    printf("%d is not present in the list\n", s);
  } else {
    printf("%d is found in the list\n", s);
  }
}

int main() {
  int n;
  printf("Enter number of Nodes : \n");
  scanf("%d", &n);
  int temp;
  for (int i=0;i<n;i++) {
    printf("Enter Number %d : ", i+1);
    scanf("%d", &temp);
    insertLast(temp);
  }
  printf("All Nodes are inserted\n");
  displayList();
  printf("Enter the number you want to search from the list\n");
  scanf("%d", &temp);
  search(temp);
  return 0;
}
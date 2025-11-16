// Q22: Write a C program to create a singly linked list with n nodes entered by the user and display its elements.

#include <stdio.h>
#include <stdlib.h>

struct Node
{
  int data;
  struct Node *next;
};

struct Node* createNode(int data) {
  struct Node *newNode = (struct Node*) malloc(sizeof(struct Node));
  if (newNode==NULL) return 0;
  newNode->data = data;
  newNode->next = NULL;
  return newNode;
}

struct Node* insertLastNode(struct Node *currentLastNode, int data) {
  struct Node* newNode = createNode(data);
  currentLastNode->next = newNode;
  return newNode;
}

int main() {
  struct Node *head = NULL;
  int n;
  printf("Enter number of Nodes : \n");
  scanf("%d", &n);
  struct Node *lastNode;
  int d;
  for (int i=0;i<n;i++) {
    int isInserted;
    printf("Enter Num %d : ", i+1);
    scanf("%d", &d);
    if (head==NULL) {
      head = createNode(d);
      lastNode = head;
    } else {
      lastNode = insertLastNode(lastNode, d);
    }
  }
  struct Node* temp = head;
  while (temp!=NULL)
  {
    printf("%d -> ", temp->data);
    temp = temp->next;
  }
  return 0;
}
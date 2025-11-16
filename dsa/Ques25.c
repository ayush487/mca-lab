// Q25: Write a C program to implement singly linked list in one program.

#include <stdio.h>
#include <stdlib.h>

struct Node
{
  int data;
  struct Node *next;
};

struct Node *head = NULL;

void insertLast()
{
  int a;
  printf("Enter number you want to insert : ");
  scanf("%d", &a);
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
    struct Node *temp = head;
    do
    {
      printf("%d -> ", temp->data);
      temp = temp->next;
    } while (temp != NULL);
    printf("\n");
  }
}

void insertFirst()
{
  int a;
  printf("Enter number you want to insert : ");
  scanf("%d", &a);
  struct Node *newNode = (struct Node *)malloc(sizeof(struct Node));
  if (newNode == NULL)
  {
    printf("Memory Allocation Failed!\nFailed to insert %d\n", a);
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
    newNode->next = head;
    head = newNode;
  }
  printf("%d inserted as first Node\n", a);
}

void search()
{
  int s;
  printf("Enter number you want to insert : ");
  scanf("%d", &s);
  if (head == NULL)
  {
    printf("List is Empty\n");
    return;
  }
  struct Node *temp = head;
  int f = 0;
  while (temp != NULL)
  {
    if (temp->data == s)
    {
      f = 1;
      break;
    }
    temp = temp->next;
  }
  if (f == 0)
  {
    printf("%d is not present in the list\n", s);
  }
  else
  {
    printf("%d is found in the list\n", s);
  }
}

void deleteNode() {
  int d;
  printf("Enter number you want to delete : ");
  scanf("%d", &d);
  if (head==NULL) {
    printf("List is empty\n");
    return;
  }
  int f = 0;
  struct Node *temp = head;
  struct Node *prev = NULL;
  int count = 0;
  while (temp!=NULL) {
    if (temp->data==d) {
      f=1;
      break;
    }
    prev = temp;
    temp = temp->next;
  }
  if (f==0) {
    printf("Number not present in the list\n");
  } else {
    if (prev==NULL) {
      head = temp->next;
    } else {
      prev->next = temp->next;
    }
    free(temp);
    printf("Node deleted with value %d\n",d);
    displayList();
  }
}


void displayOptions()
{
  printf("1. Display List\n");
  printf("2. Insert at Last\n");
  printf("3. Insert at First\n");
  printf("4. Delete any Node\n");
  printf("5. Search Node\n");
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
      insertFirst();
      break;
    case 4:
      deleteNode();
      break;
    case 5:
      search();
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

  return 1;
}
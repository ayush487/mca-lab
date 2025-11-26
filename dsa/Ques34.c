// Q34. Write a program to implement a simple queue using an array with operations enqueue, dequeue, and display.

#include <stdio.h>
#define MAX 20

struct Queue
{
  int data[MAX];
  int front;
  int rear;
};

void enqueue(struct Queue *queue, int value)
{
  
  if ((queue->rear + 1) % MAX == queue->front) {
    printf("Queue is full\n");
    return;
  }
  if (queue->front == -1) {
    queue->data[++queue->front] = value;
    queue->rear = queue->front;
  } else {
    queue->data[++queue->rear] = value;
  }
  printf("Number added into the queue\n");
}

int dequeue(struct Queue *queue)
{
  if (queue->front==-1) {
    printf("Queue is empty\n");
    return -1;
  }
  if (queue->front==queue->rear) {
    int val = queue->data[queue->front];
    queue->front = -1;
    queue->rear = -1;
    printf("Deleted %d from the queue\n");
    return val;
  } else {
    // if (queue->rear == 0) {
    //   queue->rear = MAX - 1;
    // } else {
    //   queue->rear--;
    // }
    // TODO 
  }
}

void display(struct Queue *queue)
{
  if (queue->front == -1)
  {
    printf("Queue is empty\n");
    return;
  }
  int i = queue->front;
  do
  {
    printf("%d at %d\n", queue->data[i % MAX], i % MAX);
  } while (i++ % MAX != queue->rear);
}

void displayOptions()
{
  printf("Queue Operations:\n");
  printf("1. Enqueue\n");
  printf("2. Dequeue\n");
  printf("3. Display\n");
  printf("0. Exit\n");
  printf("Enter your choice: ");
}

int main()
{
  struct Queue queue;
  queue.front = -1;
  queue.rear = -1;
  int input, temp;
  do
  {
    displayOptions();
    scanf("%d", &input);
    switch (input)
    {
    case 1:
      printf("Enter value to enqueue: ");
      scanf("%d", &temp);
      enqueue(&queue, temp);
      break;
    case 2:
      temp = dequeue(&queue);
      printf("Dequeued %d from Queue\n", temp);
      break;
    case 3:
      display(&queue);
      break;
    default:
      printf("Enter a valid input\n");
      break;
    }
  } while (input != 0);
  return 1;
}
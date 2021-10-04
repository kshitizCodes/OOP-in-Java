package QN4;

class StringQueue implements Queue {
    int[] queue;
    int front;
    int rear;
    int MAX;

    StringQueue(int MAX) {
        this.MAX = MAX;
        queue = new int[MAX];
        front = 0;
        rear = 0;
    }

    public void enqueue(int n) {
        if (rear == MAX) {
            System.out.println("Queue is full.");
        } else {
            System.out.println(n + " added to the queue.");
            queue[rear] = n;
            rear++;
        }
    }

    public void dequeue() {
        if (front == MAX) {
            System.out.println("Queue is empty");
        } else {
            System.out.println(queue[front] + " has been removed from queue.");
            front++;
        }
    }

    public void display() {
        if (rear == 0 || front == MAX) {
            System.out.println("Queue is empty");
        } else {
            System.out.println("\nQueue: ");
            for (int i = front; i < rear; i++) {
                System.out.print("\t" + queue[i]);
            }
            System.out.println();
        }
    }
}

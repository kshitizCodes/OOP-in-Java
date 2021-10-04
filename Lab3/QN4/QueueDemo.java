package QN4;

public class QueueDemo {
    public static void main(String[] args) {
        StringQueue queue = new StringQueue(5);
        queue.display();
        for (int i = 5; i < 35; i += 5) {
            queue.enqueue(i);
        }
        queue.display();
        for (int i = 5; i < 35; i += 5) {
            queue.dequeue();
        }
        queue.display();

    }
}

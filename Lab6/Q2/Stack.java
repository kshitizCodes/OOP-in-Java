package Q2;

public class Stack extends Thread {
    private int top = -1;
    private final int[] stack;
    private final int size;

    Stack(int size) {
        this.size = size;
        this.stack = new int[size];
    }

    synchronized void pop() {
        if (top == -1) {
            System.out.println("Stack is empty. Waiting for push.");
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(stack[top] + " has been popped.");
        top--;
    }

    synchronized void push(int n) {
        if (top == size - 1) {
            System.out.println("Can't push, stack is full.");
        } else {
            stack[++top] = n;
            System.out.println(n + " has been pushed.");
            notify();
        }
    }
}
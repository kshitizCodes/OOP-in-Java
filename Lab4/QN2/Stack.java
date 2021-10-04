package QN2;

class Stack {
    int top = -1;
    int[] stack;
    int size;

    Stack(int size) {
        this.size = size;
        stack = new int[size];
    }

    void push(int data) throws StackFullException {
        if (top == size - 1) {
            throw new StackFullException("Stack is full.");
        } else {
            top++;
            stack[top] = data;
            System.out.println(stack[top] + " pushed in the stack.");
        }
    }

    void pop() throws StackEmptyException {
        if (top == -1) {
            throw new StackEmptyException("Stack is empty.");
        } else {
            System.out.println(stack[top] + " popped from the stack");
            top--;
        }
    }

    void display() {
        if (top == -1) {
            System.out.println("Stack is empty.");
        } else {
            for (int i = top; i < size; i++) {
                System.out.print("\t" + stack[top]);
            }
        }
    }
}

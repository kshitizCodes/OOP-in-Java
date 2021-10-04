package QN2;

class StackDemo {
    public static void main(String[] args) {
        Stack stack = new Stack(6);
        try {
            for (int i = 0; i <= 35; i += 5) {
                stack.push(i);
            }
        } catch (StackFullException e) {
            System.out.println("Stack overflow.");
        }
        try {
            for (int i = 0; i < 7; i++) {
                stack.pop();
            }
        } catch (StackEmptyException e) {
            System.out.println("Stack underflow.");
        }
    }
}

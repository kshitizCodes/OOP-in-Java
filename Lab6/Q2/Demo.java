package Q2;

public class Demo {
    public static void main(String[] args) {
        Stack stack = new Stack(5);
        new Thread(() -> {
            stack.pop();
            stack.pop();
        }).start();

        new Thread(() -> {
            stack.push(5);
            stack.push(6);
        }).start();
    }
}
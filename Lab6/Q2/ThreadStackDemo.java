package Q2;

public class ThreadStackDemo {
    public static void main(String[] args) {
        ThreadStack stack = new ThreadStack(5);
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
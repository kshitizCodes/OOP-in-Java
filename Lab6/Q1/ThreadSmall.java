package Q1;

public class ThreadSmall implements Runnable {
    @Override
    public void run() {
        char c = 'a';
        while (c != 'z' + 1) {
            System.out.printf("%c", c++);
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
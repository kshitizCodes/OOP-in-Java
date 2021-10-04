package Q1;

public class ThreadCapital implements Runnable {
    @Override
    public void run() {
        char c = 'A';
        while (c != 'Z' + 1) {
            System.out.printf("%c", c++);
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
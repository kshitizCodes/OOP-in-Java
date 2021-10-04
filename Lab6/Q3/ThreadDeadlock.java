package Q3;

public class ThreadDeadlock {
    public static void main(String[] args) {
        Object ob1 = new Object();
        Object ob2 = new Object();
        new Thread(() -> {
            synchronized (ob1) {
                System.out.println("Thread 1: holding 1");
                try {
                    Thread.sleep(10);
                } catch (InterruptedException ignored) {
                }
                System.out.println("Thread 1: waiting for 2");
                synchronized (ob2) {
                    System.out.println("Holding 1 and 2");
                }
            }
        }).start();
        new Thread(() -> {
            synchronized (ob2) {
                System.out.println("Thread 2: holding 2");
                try {
                    Thread.sleep(10);
                } catch (InterruptedException ignored) {
                }
                System.out.println("Thread 2: waiting for 1");
                synchronized (ob1) {
                    System.out.println("Holding 1 and 2");
                }
            }
        }).start();
    }
}
package Q1;

public class ThreadDemo {
    public static void main(String[] args) {
        Thread ts = new Thread(new ThreadSmall());
        Thread tc = new Thread(new ThreadCapital());
        ts.start();
        tc.start();
    }
}
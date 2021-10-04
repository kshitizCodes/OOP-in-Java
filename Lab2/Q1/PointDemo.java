package Q1;

public class PointDemo {
    public static void main(String[] args) {
        Point p1 = new Point(1, 1);
        Point p2 = new Point(1, 5);
        System.out.println("Distance from P1 to P2 is " + p1.distanceTo(p2) + " units");
        Point p3 = p1.midpoint(p2);
        System.out.println("Midpoint: " + p3.x + " " + p3.y);
    }
}

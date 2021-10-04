package Q1;

import java.lang.Math;

class Point {
    double x, y;

    Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    double distanceTo(Point p2) {
        return Math.sqrt(Math.pow((p2.x - x), 2) + Math.pow((p2.y - y), 2));
    }

    Point midpoint(Point p2) {
        double midX = (p2.x + x) / 2;
        double midY = (p2.y + y) / 2;
        return new Point(midX, midY);
    }
}

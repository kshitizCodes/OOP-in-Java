package QN3;

import java.lang.Math;

class Cylinder extends Shape {
    private double radius;
    private double height;

    Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    double getVolume() {
        return 4 * Math.PI * Math.pow(radius, 2) * height;
    }
}

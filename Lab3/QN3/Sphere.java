package QN3;

import java.lang.Math;

class Sphere extends Shape {
    private double radius;

    Sphere(double radius) {
        this.radius = radius;
    }

    @Override
    double getVolume() {
        return 4 / 3 * Math.PI * Math.pow(radius, 3);
    }
}

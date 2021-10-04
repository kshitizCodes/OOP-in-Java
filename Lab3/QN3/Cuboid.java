package QN3;

class Cuboid extends Shape {
    private double length;
    private double breadth;
    private double height;

    Cuboid(double length, double breadth, double height) {
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }

    @Override
    double getVolume() {
        return length * breadth * height;
    }
}

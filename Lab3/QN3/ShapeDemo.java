package QN3;

public class ShapeDemo {
    public static void main(String[] args) {
        Shape[] shape = new Shape[10];
        shape[0] = new Cuboid(5, 6, 7);
        shape[1] = new Cylinder(5, 6);
        shape[2] = new Sphere(5);
        for (int i = 0; i < 3; i++) {
            System.out.println(shape[i].getVolume());
        }
    }
}

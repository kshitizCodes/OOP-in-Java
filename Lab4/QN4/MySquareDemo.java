package QN4;

class MySquareDemo {
    public static void main(String[] args) {
        double[] sides = {5.0, -1.0, 0.0, 1.0, 2.0, 3.0};
        MySquare square = new MySquare(5);
        for (int i = 0; i < sides.length; i++) {
            try {
                System.out.println("Area of square(" + i + ") is " + square.area(sides[i]));
            } catch (ShapeException e) {
                System.out.println("Square(" + i + "): Invalid Shape");
            }
        }
    }
}

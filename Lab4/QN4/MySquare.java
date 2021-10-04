package QN4;

public class MySquare {
    double side;

    MySquare(double side) {
        this.side = side;
    }

    double area(double side) throws ShapeException {
        if (side <= 0) {
            throw new ShapeException("Error in supplied length of side.");
        } else {
            return side * side;
        }

    }
}

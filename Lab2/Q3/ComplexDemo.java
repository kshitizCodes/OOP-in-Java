package Q3;

public class ComplexDemo extends Complex {
    public static void main(String[] args) {
        Complex c = new Complex(5, -6);
        Complex c1 = new Complex(6, 2);
        Complex c3 = c.add(c1);
        Complex c4 = c.add(5, -2);
        Complex c5 = c.subtract(c1);
        System.out.println(c3.getReal() + " " + c3.getImaginary() + "i");
        System.out.println(c4.getReal() + " " + c4.getImaginary() + "i");
        System.out.println(c5.getReal() + " " + c5.getImaginary() + "i");
    }
}

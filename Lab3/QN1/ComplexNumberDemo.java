package QN1;

class ComplexNumberDemo {
    public static void main(String[] args) {
        ComplexNumber c = new ComplexNumber(5, 6);
        c.setParent(5, 6);
        c.add().display();
        ComplexNumber c1 = new ComplexNumber(7, 3);
        ComplexNumber c2 = c.add(c1);
        System.out.printf("Adding of two objects \n\t%+d%+di\n", c2.real, c2.imaginary);
        ComplexNumber c3 = c.subtract(c1);
        System.out.printf("Subtracting of two objects \n\t%+d%+di\n", c3.real, c3.imaginary);

    }
}
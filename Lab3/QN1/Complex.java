package QN1;

class Complex {
    int real;
    int imaginary;

    Complex() {
    }

    Complex(int real, int imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    void display() {
        System.out.printf("Adding child and parent\n\t%+d%+di\n", real, imaginary);
    }
}

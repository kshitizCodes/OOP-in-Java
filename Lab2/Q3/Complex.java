package Q3;

public class Complex {
    private float real;
    private float imaginary;

    Complex() {
    }

    Complex(float real, float imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    Complex add(Complex C) {
        float realAdd = real + C.real;
        float imaginaryAdd = imaginary + C.imaginary;
        return new Complex(realAdd, imaginaryAdd);
    }

    Complex add(double realValue, double imaginaryValue) {
        float realAdd = real + (float) realValue;
        float imaginaryAdd = imaginary + (float) imaginaryValue;
        return new Complex(realAdd, imaginaryAdd);
    }

    Complex subtract(Complex C) {
        float realSub = real - C.real;
        float imaginarySub = imaginary - C.imaginary;
        return new Complex(realSub, imaginarySub);
    }

    public float getReal() {
        return real;
    }

    public float getImaginary() {
        return imaginary;
    }
}

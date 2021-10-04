package QN1;

class ComplexNumber extends Complex {
    int real;
    int imaginary;

    ComplexNumber(int real, int imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    void setParent(int real, int imaginary) {
        super.real = real;
        super.imaginary = imaginary;
    }

    Complex add() {
        return new Complex(real + super.real, imaginary + super.imaginary);
    }

    ComplexNumber add(ComplexNumber CN) {
        int realAdd = real + CN.real;
        int imgAdd = imaginary + CN.imaginary;
        return new ComplexNumber(realAdd, imgAdd);
    }

    ComplexNumber subtract(ComplexNumber CN) {
        int realSub = real - CN.real;
        int imgSub = imaginary - CN.imaginary;
        return new ComplexNumber(realSub, imgSub);
    }
}

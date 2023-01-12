package two;

class Complex {
    double real;
    double imag;

    public Complex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public static Complex operator (Complex c1, Complex c2) {
        return new Complex(c1.real + c2.real, c1.imag + c2.imag);
    }

    public String toString() {
        return real + " + " + imag;
    }


    public static void main(String[] args) {
        Complex complexNumber1 = new Complex(3, 4);
        Complex complexNumber2 = new Complex(1, 2);
        Complex complexNumber3 = operator(complexNumber1, complexNumber2);
        complexNumber3.toString();

        System.out.println("complexNumber1 + complexNumber2: " + complexNumber3);
    }
}

package three;

public class Complex {
    double real;
    double imag;

    public Complex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public double magnitude() {
        return Math.sqrt(real*real + imag*imag);
    }

    public boolean operator (Complex other) {
        return this.magnitude() < other.magnitude();
    }

    public static void main(String[] args) {
        Complex complexNumber1 = new Complex(3, 4);
        Complex complexNumber2 = new Complex(1, 2);

        System.out.println(complexNumber1.operator(complexNumber2));
        System.out.println(complexNumber2.operator(complexNumber1));
    }
}

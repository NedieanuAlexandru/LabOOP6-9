package one;

public class Complex {
    double real;
    double imag;

    public Complex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public double getModule() {
        return Math.sqrt(real*real + imag*imag);
    }

    public static void main(String[] args) {
        Complex c1 = new Complex(4, 5);
        Complex c2 = new Complex(11, 12);

        if(c1.getModule() < c2.getModule()) {
            System.out.println("c1");
        } else {
            System.out.println("c2");
        }
    }
}

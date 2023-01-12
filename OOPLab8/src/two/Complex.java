package two;

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

    public boolean lessThan(float value) {
        return this.magnitude() < value;
    }

    public int compareTo(float value) {
        return Double.compare(this.magnitude(), new Complex(value, 0).magnitude());
    }

    public static void main(String[] args) {
        Complex c1 = new Complex(1.1, 2.2);
        float c2 = 3.2f;

        if(c1.lessThan(c2)) {
            System.out.println("c1 < c2");
        } else if (c2 < c1.magnitude()) {
            System.out.println("c2 < c1");
        } else {
            System.out.println("c1 = c2");
        }

        Complex c3 = new Complex(14, 15);
        float c4 = 7.3f;

        if(c3.lessThan(c4)) {
            System.out.println("c3 < c4");
        } else if (c4 < c3.magnitude()) {
            System.out.println("c4 < c3");
        } else {
            System.out.println("c3 = c4");
        }
    }

}

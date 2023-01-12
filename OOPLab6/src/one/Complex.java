package one;

class Complex {
    double real;
    double imag;

    public Complex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public double abs() {
        return Math.sqrt(real*real + imag*imag);
    }

    public Complex pow(double power) {
        double abs = Math.pow(abs(), power);
        double arg = Math.atan2(imag, real);
        return new Complex(abs * Math.cos(power * arg), abs * Math.sin(power * arg));
    }

    public static Complex add(Complex n1, Complex n2) {
        Complex res = new Complex(0, 0);
        res.real = n1.real + n2.real;
        res.imag = n1.imag + n2.imag;
        return res;
    }

    public static Complex valueOf(double real, double imag) {
        return new Complex(real, imag);
    }

    public static void main(String[] args) {
        Complex c1 = new Complex(3, 4);
        Complex c2 = new Complex(1, 2);

        System.out.println(add(c1, c2));
        System.out.println(c1.abs());
        System.out.println(c1.pow(2));
    }
}

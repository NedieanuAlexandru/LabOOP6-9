package one;

public class Ex1 {
    public static void main(String[] args) {
        Drawing d = new Drawing(new Triangle());
        d.drawShape();
        d = new Drawing(new Circle());
        d.drawShape();
    }
}

abstract class Shape {
    public abstract void draw();
}

class Circle extends Shape {
    public void draw() {
        System.out.println("circle");
    }
}

class Triangle extends Shape {
    public void draw() {
        System.out.println("triangle");
    }
}

class Drawing {
    private Shape shape;

    public Drawing(Shape shape) {
        this.shape = shape;
    }

    public void drawShape() {
        shape.draw();
    }
}
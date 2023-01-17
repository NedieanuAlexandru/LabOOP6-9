package two;

import java.util.ArrayList;
import java.util.List;

public class Ex2 {
    public static void main(String[] args) {
        List<Vehicle> vehicles = new ArrayList<Vehicle>();
        vehicles.add(new Car("Red Car", "aaa"));
        vehicles.add(new Car("Awesome Car", "bbb"));
        vehicles.add(new Rocket("NASA Rocket", 23));
        for (Vehicle element : vehicles) {
            element.start();
        }
    }
}

abstract class Vehicle {
    protected String name;

    public abstract void start();
}

class Rocket extends Vehicle {
    public Rocket(String name, int id) {
        this.name = name;
    }

    public void start() {
        System.out.println("start " + this.name);
    }
}

class Car extends Vehicle {
    public Car(String name, String licenseNumber) {
        this.name = name;
    }

    public void start() {
        System.out.println("start " + this.name);
    }
}

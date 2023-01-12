package one;

public class Car {
    int km;
    String brand;
    int wheels = 4;

    public Car(String brand) {
        this.brand = brand;
    }

    public void change1Tire(String brand, String weather) {
        if(brand == this.brand) {
            System.out.println("Changed the tire of the " + brand + " for " + weather);
        } else {
            System.out.println("Not compatible.");
        }
    }

    public void remove1Tire() {
        if (wheels < 0) {
            System.out.println("Can't remove wheels if there are none left");
        } else {
            System.out.println("One wheel removed");
            this.wheels--;
        }
    }

    public String displayTires(String brand) {
        return "The " + brand + " has " + this.wheels + " tires.";
    }

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }
}

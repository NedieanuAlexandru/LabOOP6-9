package three;

public class Car2 {
    String brand;
    int km;
    Driver driver;


    public Car2(String brand, int km, Driver driver) {
        this.brand = brand;
        this.km = km;
        this.driver = driver;
    }

    public Car2(String brand, int km) {
        this.brand = brand;
        this.km = km;
    }


    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }
}

package three;

public class Driver {
    String name;
    int yearsOfLicense;
    Car2 car;

    public Driver(String name, int yearsOfLicense) {
        this.name = name;
        this.yearsOfLicense = yearsOfLicense;
    }


    public void getNewCar(Car2 car) {
        if (car.getDriver() != null) {
            System.out.println("The car already has a driver");
        } else {
            this.car = car;
            System.out.println(this.name + " just got a new " + car.brand);
        }
    }

    public void hasCar() {
        if(this.car != null) {
            System.out.println(this.name + " has a " + car.brand);
        } else {
            System.out.println(this.name + " has no car at the moment.");
        }
    }

    public void sellCar() {
        this.car = null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearsOfLicense() {
        return yearsOfLicense;
    }

    public void setYearsOfLicense(int yearsOfLicense) {
        this.yearsOfLicense = yearsOfLicense;
    }

    public Car2 getCar() {
        return car;
    }

    public void setCar(Car2 car) {
        this.car = car;
    }
}

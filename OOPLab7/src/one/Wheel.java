package one;

public class Wheel {
    int side;
    String weather;
    String brand;

    public Wheel() {}

    public Wheel(char side, String weather, String brand) {
        this.side = side;
        this.weather = weather;
        this.brand = brand;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    public String getWeather() {
        return weather;
    }

    public void setWeather(String weather) {
        this.weather = weather;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}

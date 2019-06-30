package main.java.filling_cars.interior;

public class Steering {
    private String color;

    private Steering(String color) {
        this.color = color;
    }

    public static Steering getSteering(String color) {
        return new Steering(color);
    }

    public String getColor() {
        return color;
    }
}

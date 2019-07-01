package main.java.factory.dynamic_cars.Interior;

public class Steering implements InteriorElements {
    private String color;

    private Steering(String color) {
        this.color = color;
    }

    public static Steering getInstance(String color) {
        return new Steering(color);
    }

    public String description() {
        return "Steering is " + color;
    }
}

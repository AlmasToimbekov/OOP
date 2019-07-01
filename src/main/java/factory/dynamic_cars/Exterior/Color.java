package main.java.factory.dynamic_cars.Exterior;

public class Color implements ExteriorElements {
    private String color;

    private Color(String color) {
        this.color = color;
    }

    public static Color getInstance(String color) {
        return new Color(color);
    }

    public String description() {
        return "Color is " + color;
    }
}

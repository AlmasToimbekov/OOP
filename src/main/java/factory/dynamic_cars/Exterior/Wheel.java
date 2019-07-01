package main.java.factory.dynamic_cars.Exterior;

public class Wheel implements ExteriorElements {
    private int quantity;

    private Wheel(int quantity) {
        this.quantity = quantity;
    }

    public static Wheel getInstance(int quantity) {
        return new Wheel(quantity);
    }

    public String description() {
        return quantity + " wheels";
    }
}
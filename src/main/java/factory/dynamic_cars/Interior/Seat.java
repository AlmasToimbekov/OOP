package main.java.factory.dynamic_cars.Interior;

public class Seat implements InteriorElements {
    private int quantity;

    private Seat(int quantity) {
        this.quantity = quantity;
    }

    public static Seat getInstance(int quantity) {
        return new Seat(quantity);
    }

    public String description() {
        return "Seats quantity: " + quantity;
    }
}

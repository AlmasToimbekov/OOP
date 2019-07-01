package main.java.factory.filling_cars.interior;

public class Seat {
    private int quantity;

    private Seat(int quantity) {
        this.quantity = quantity;
    }

    public static Seat getSeat(int quantity) {
        return new Seat(quantity);
    }

    public int getQuantity() {
        return quantity;
    }
}

package main.java.factory.filling_cars.exterior;

public class Wheel {
    private int quantity;

    private Wheel(int quantity) {
        this.quantity = quantity;
    }

    public static Wheel getInstance(int quantity) {
        return new Wheel(quantity);
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}

package main.java.filling_cars;

class Wheel {
    private String quantity;
    private Wheel(String quantity) {
        this.quantity = quantity;
    }
    static Wheel getWheel(String quantity) {
        return new Wheel(quantity);
    }
}

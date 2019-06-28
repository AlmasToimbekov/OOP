package main.java.filling_cars;

public class ExteriorImpl implements Exterior {
    private Wheel wheel;

    private ExteriorImpl () {

    }

    static Exterior setExterior() {
        return new ExteriorImpl();
    }

    @Override
    public Wheel getWheel() {
        return this.wheel;
    }

    public void setWheel(String wheelQuantity) {
        this.wheel = Wheel.getWheel(wheelQuantity);
    }

    @Override
    public Engine getEngine() {
        return null;
    }
}
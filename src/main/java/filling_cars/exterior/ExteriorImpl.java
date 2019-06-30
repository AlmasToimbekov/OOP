package main.java.filling_cars.exterior;

public abstract class ExteriorImpl implements Exterior {
    private Wheel wheel;
    private Engine engine;

    protected ExteriorImpl(Wheel wheel, Engine engine) {
        this.wheel = wheel;
        this.engine = engine;
    }

    @Override
    public Wheel wheel() {
        return this.wheel;
    }

    @Override
    public Engine engine() {
        return this.engine;
    }
}

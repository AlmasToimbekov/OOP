package main.java.factory.filling_cars.exterior;

public class SimpleCarExterior extends ExteriorImpl {

    private SimpleCarExterior(Wheel wheel, Engine engine) {
        super(wheel, engine);
    }

    public static Exterior setExterior() {
        return new SimpleCarExterior(Wheel.getInstance(4), Engine.getInstance(110));
    }
}
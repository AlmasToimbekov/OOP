package main.java.filling_cars.exterior;

public class SimpleCarExterior extends ExteriorImpl {

    private SimpleCarExterior(Wheel wheel, Engine engine) {
        super(wheel, engine);
    }

    public static Exterior setExterior() {
        return new SimpleCarExterior(Wheel.getWheel(4), Engine.getEngine(110));
    }
}
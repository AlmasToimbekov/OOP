package main.java.filling_cars.exterior;

public class SportCarExterior extends ExteriorImpl {

    private SportCarExterior(Wheel wheel, Engine engine) {
        super(wheel, engine);
    }

    public static Exterior setExterior() {
        return new SportCarExterior(Wheel.getWheel(4), Engine.getEngine(400));
    }
}
package main.java.factory.filling_cars.exterior;

public class SportCarExterior extends ExteriorImpl {

    private SportCarExterior(Wheel wheel, Engine engine) {
        super(wheel, engine);
    }

    public static Exterior setExterior() {
        return new SportCarExterior(Wheel.getInstance(4), Engine.getInstance(400));
    }
}
package main.java.factory.dynamic_cars.Exterior;

import main.java.factory.dynamic_cars.Car;

public class SimpleCarExterior extends ExteriorImpl {
    protected SimpleCarExterior(Car car) {
        super(car);
    }

    public static SimpleCarExterior getInstance(Car car) {
        return new SimpleCarExterior(car);
    }

    public void create() {
        elements.add(Wheel.getInstance(4));
        elements.add(Engine.getInstance(110));
        elements.add(Color.getInstance("white"));
    }
}

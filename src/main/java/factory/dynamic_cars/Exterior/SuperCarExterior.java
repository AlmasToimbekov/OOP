package main.java.factory.dynamic_cars.Exterior;

import main.java.factory.dynamic_cars.Car;

public class SuperCarExterior extends ExteriorImpl {
    protected SuperCarExterior(Car car) {
        super(car);
    }

    public static SuperCarExterior getInstance(Car car) {
        return new SuperCarExterior(car);
    }

    public void create() {
        elements.add(Wheel.getInstance(4));
        elements.add(Engine.getInstance(400));
        elements.add(Color.getInstance("yellow"));
    }
}

package main.java.factory.dynamic_cars.Interior;

import main.java.factory.dynamic_cars.Car;

public class SimpleCarInterior extends InteriorImpl {
    protected SimpleCarInterior(Car car) {
        super(car);
    }

    public static SimpleCarInterior getInstance(Car car) {
        return new SimpleCarInterior(car);
    }

    public void create() {
        elements.add(Seat.getInstance(4));
        elements.add(Steering.getInstance("black"));
    }
}

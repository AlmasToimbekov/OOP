package main.java.factory.dynamic_cars.Interior;

import main.java.factory.dynamic_cars.Car;

public class SuperCarInterior extends InteriorImpl {
    protected SuperCarInterior(Car car) {
        super(car);
    }

    public static SuperCarInterior getInstance(Car car) {
        return new SuperCarInterior(car);
    }

    public void create() {
        elements.add(Seat.getInstance(2));
        elements.add(Steering.getInstance("red"));
    }
}

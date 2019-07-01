package main.java.factory.filling_cars;

import main.java.factory.filling_cars.exterior.Exterior;
import main.java.factory.filling_cars.exterior.SimpleCarExterior;
import main.java.factory.filling_cars.interior.Interior;
import main.java.factory.filling_cars.interior.SimpleCarInterior;

public class SimpleCar extends CarFactory {
    private String name;
    private Interior interior;
    private Exterior exterior;

    private SimpleCar(String name) {
        this.name = name;
        this.exterior = SimpleCarExterior.setExterior();
        this.interior = SimpleCarInterior.setInterior();
    }

    public static Car getCar(String name) {
        return new SimpleCar(name);
    }

    @Override
    public String description() {
        return String.format("%s, engine: %s h.p., %s wheels, %s seats and %s steering", name, exterior.engine().getHP(),
                exterior.wheel().getQuantity(), interior.seat().getQuantity(), interior.steering().getColor());
    }
}

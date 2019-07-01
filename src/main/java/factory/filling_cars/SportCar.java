package main.java.factory.filling_cars;

import main.java.factory.filling_cars.exterior.Exterior;
import main.java.factory.filling_cars.exterior.SportCarExterior;
import main.java.factory.filling_cars.interior.Interior;
import main.java.factory.filling_cars.interior.SportCarInterior;

public class SportCar extends CarFactory {
    private String name;
    private Interior interior;
    private Exterior exterior;

    private SportCar(String name) {
        this.name = name;
        this.exterior = SportCarExterior.setExterior();
        this.interior = SportCarInterior.setInterior();
    }

    public static Car getCar(String name) {
        return new SportCar(name);
    }

    @Override
    public String description() {
        return String.format("%s, engine: %s h.p., %s wheels, %s seats and %s steering", name, exterior.engine().getHP(),
                exterior.wheel().getQuantity(), interior.seat().getQuantity(), interior.steering().getColor());
    }
}

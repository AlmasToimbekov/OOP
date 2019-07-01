package main.java.factory.dynamic_cars;

import main.java.factory.dynamic_cars.Exterior.*;
import main.java.factory.dynamic_cars.Interior.Interior;
import main.java.factory.dynamic_cars.Interior.SimpleCarInterior;

public class SimpleCar extends CarImpl {

    private SimpleCar(String name) {
        this.name = name;
        exterior = SimpleCarExterior.getInstance(this);
        interior = SimpleCarInterior.getInstance(this);
    }

    public static SimpleCar getInstance(String name) {
        return new SimpleCar(name);
    }

    public Exterior exterior() {
        return exterior;
    }
    public Interior interior() {
        return interior;
    }

    public SimpleCar create() {
        exterior.create();
        interior.create();
        return this;
    }
}

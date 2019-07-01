package main.java.factory.dynamic_cars;

import main.java.factory.dynamic_cars.Exterior.Exterior;
import main.java.factory.dynamic_cars.Exterior.SuperCarExterior;
import main.java.factory.dynamic_cars.Interior.Interior;
import main.java.factory.dynamic_cars.Interior.SuperCarInterior;

public class SuperCar extends CarImpl {

    private SuperCar(String name) {
        this.name = name;
        exterior = SuperCarExterior.getInstance(this);
        interior = SuperCarInterior.getInstance(this);
    }

    public static SuperCar getInstance(String name) {
        return new SuperCar(name);
    }

    public Exterior exterior() {
        return exterior;
    }
    public Interior interior() {
        return interior;
    }

    public SuperCar create() {
        exterior.create();
        interior.create();
        return this;
    }
}

package main.java.filling_cars;

import main.java.filling_cars.exterior.Exterior;
import main.java.filling_cars.interior.Interior;

public abstract class CarFactory implements Car {
    private String name;
    private Interior interior;
    private Exterior exterior;

    @Override
    public Interior interior() {
        return interior;
    }

    @Override
    public Exterior exterior() {
        return exterior;
    }

    public String getName() {
        return name;
    }
}

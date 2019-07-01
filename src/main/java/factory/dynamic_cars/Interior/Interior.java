package main.java.factory.dynamic_cars.Interior;

import main.java.factory.dynamic_cars.Car;

import java.util.List;

public interface Interior {
    Interior setElement(InteriorElements element);
    List<InteriorElements> getElements();
    Car and();
    void create();
}

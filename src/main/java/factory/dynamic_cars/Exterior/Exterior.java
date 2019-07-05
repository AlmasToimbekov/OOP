package main.java.factory.dynamic_cars.Exterior;

import main.java.factory.dynamic_cars.Car;
import main.java.factory.dynamic_cars.Iterator;

import java.util.List;

public interface Exterior {
    Exterior setElement(ExteriorElements element);
    List<ExteriorElements> getElements();
    Car and();
    void create();
    Iterator createIterator();
}

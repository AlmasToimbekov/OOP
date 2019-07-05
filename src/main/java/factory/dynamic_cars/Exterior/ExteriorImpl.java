package main.java.factory.dynamic_cars.Exterior;

import main.java.factory.dynamic_cars.Car;
import main.java.factory.dynamic_cars.Iterator;

import java.util.ArrayList;
import java.util.List;

public abstract class ExteriorImpl implements Exterior {

    Car car;
    List<ExteriorElements> elements;

    protected ExteriorImpl(Car car) {
        this.car = car;
        elements = new ArrayList<>();
    }

    public ExteriorImpl setElement(ExteriorElements element) {
        elements.add(element);
        return this;
    }

    @Override
    public List<ExteriorElements> getElements() {
        return elements;
    }

    public Car and() {
        return car;
    }

    public Iterator createIterator() {
        return new ExteriorElementsIterator(elements);
    }
}

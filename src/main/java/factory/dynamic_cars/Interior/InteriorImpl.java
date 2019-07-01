package main.java.factory.dynamic_cars.Interior;

import main.java.factory.dynamic_cars.Car;
import java.util.ArrayList;
import java.util.List;

public abstract class InteriorImpl implements Interior {

    Car car;
    List<InteriorElements> elements;

    protected InteriorImpl(Car car) {
        this.car = car;
        elements = new ArrayList<>();
    }

    public InteriorImpl setElement(InteriorElements element) {
        elements.add(element);
        return this;
    }

    @Override
    public List<InteriorElements> getElements() {
        return elements;
    }

    public Car and() {
        return car;
    }
}

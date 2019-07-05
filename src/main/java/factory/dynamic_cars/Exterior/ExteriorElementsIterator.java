package main.java.factory.dynamic_cars.Exterior;

import main.java.factory.dynamic_cars.Exterior.ExteriorElements;
import main.java.factory.dynamic_cars.Iterator;

import java.util.List;

public class ExteriorElementsIterator implements Iterator {

    List<ExteriorElements> elements;
    int currentElement = 0;

    public ExteriorElementsIterator(List<ExteriorElements> elements) {
        this.elements = elements;
    }

    @Override
    public String getNextDescription() {
        String string = elements.get(currentElement).description();
        currentElement++;
        return string;
    }

    @Override
    public boolean hasNext() {
        return elements.size() > currentElement;
    }
}
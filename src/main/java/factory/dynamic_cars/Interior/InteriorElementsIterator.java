package main.java.factory.dynamic_cars.Interior;

import main.java.factory.dynamic_cars.Interior.InteriorElements;
import main.java.factory.dynamic_cars.Iterator;

import java.util.List;

public class InteriorElementsIterator implements Iterator {

    List<InteriorElements> elements;
    int currentElement = 0;

    public InteriorElementsIterator(List<InteriorElements> elements) {
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
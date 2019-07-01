package main.java.test.Exterior;

import java.util.ArrayList;
import java.util.List;

public abstract class ExteriorImpl implements Exterior {

    List<Elements> elements;

    public ExteriorImpl() {
        elements = new ArrayList<>();
    }

    public void setElement(Elements element) {
        elements.add(element);
    }

    @Override
    public List<Elements> getElements() {
        return elements;
    }
}

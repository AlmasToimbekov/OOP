package main.java.factory.dynamic_cars;

import main.java.factory.dynamic_cars.Exterior.Exterior;
import main.java.factory.dynamic_cars.Interior.Interior;

import java.util.List;

public abstract class CarImpl implements Car {

    protected Exterior exterior;
    protected Interior interior;
    protected String name;

    public void description() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Exterior: ");

        getDescriptions(stringBuilder, exterior.getElements());

        if (interior.getElements().size() > 0) stringBuilder.append("Interior: ");

        getDescriptions(stringBuilder, interior.getElements());

        System.out.println(this.getClass().getName().substring(31).toUpperCase() + " " + name + ": " + stringBuilder.toString());
    }

    private void getDescriptions(StringBuilder stringBuilder, List<? extends Elements> elements) {
        for (int item = 0; item < elements.size(); item++) {
            stringBuilder.append(elements.get(item).description());
            if (item == elements.size() - 1) {
                stringBuilder.append(".\n");
            } else {
                stringBuilder.append(", ");
            }
        }
    }

    public Car create() {
        return this;
    }
}

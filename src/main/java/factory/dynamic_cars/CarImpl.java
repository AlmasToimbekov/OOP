package main.java.factory.dynamic_cars;

import main.java.factory.dynamic_cars.Exterior.Exterior;
import main.java.factory.dynamic_cars.Interior.Interior;

public abstract class CarImpl implements Car {

    protected Exterior exterior;
    protected Interior interior;
    protected String name;

    public void description() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Exterior: ");
        for (int item = 0; item < exterior.getElements().size(); item++) {
            stringBuilder.append(exterior.getElements().get(item).description());
            if (item == exterior.getElements().size() - 1) {
                stringBuilder.append(";\n");
            } else {
                stringBuilder.append(", ");
            }
        }

        if (interior.getElements().size() > 0) stringBuilder.append("Interior: ");

        for (int item = 0; item < interior.getElements().size(); item++) {
            stringBuilder.append(interior.getElements().get(item).description());
            if (item == interior.getElements().size() - 1) {
                stringBuilder.append(".\n");
            } else {
                stringBuilder.append(", ");
            }
        }

        System.out.println(this.getClass().getName().substring(31).toUpperCase() + " " + name + ": " + stringBuilder.toString());
    }

    public Car create() {
        return this;
    }
}

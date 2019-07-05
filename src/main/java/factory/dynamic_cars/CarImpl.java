package main.java.factory.dynamic_cars;

import main.java.factory.dynamic_cars.Exterior.Exterior;
import main.java.factory.dynamic_cars.Interior.Interior;
import java.util.List;

public abstract class CarImpl implements Car {

    protected Exterior exterior;
    protected Interior interior;
    protected String name;

    public void description(Car.PrintType printType) {
        if (printType == Car.PrintType.CYCLE) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Exterior: ");

            getDescriptions(stringBuilder, exterior.getElements());

            if (interior.getElements().size() > 0) stringBuilder.append("Interior: ");

            getDescriptions(stringBuilder, interior.getElements());

            System.out.println(this.getClass().getName().substring(31).toUpperCase() + " " + name + ": " + stringBuilder.toString());
        } else if (printType.equals(Car.PrintType.ITERATOR)) {
            getDescriptionsWithIterator();
        }
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

    private void getDescriptionsWithIterator() {
        Iterator exteriorIterator = exterior.createIterator();
        Iterator interiorIterator = interior.createIterator();

        System.out.print(this.getClass().getName().substring(31).toUpperCase() + " " + name + ": ");

        System.out.print("Exterior: ");
        printDescriptions(exteriorIterator);
        System.out.print("\nInterior: ");
        printDescriptions(interiorIterator);
        System.out.println("\n");

    }

    private void printDescriptions(Iterator iterator) {
        while (iterator.hasNext()) {
            System.out.print(iterator.getNextDescription() + ", ");
        }

    }

    public Car create() {
        return this;
    }
}

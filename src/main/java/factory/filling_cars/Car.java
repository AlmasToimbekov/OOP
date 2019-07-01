package main.java.factory.filling_cars;

import main.java.factory.filling_cars.exterior.Exterior;
import main.java.factory.filling_cars.interior.Interior;

public interface Car {
    Interior interior();
    Exterior exterior();
    String description();
}

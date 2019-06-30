package main.java.filling_cars;

import main.java.filling_cars.exterior.Exterior;
import main.java.filling_cars.interior.Interior;

public interface Car {
    Interior interior();
    Exterior exterior();
    String description();
}

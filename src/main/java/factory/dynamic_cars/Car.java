package main.java.factory.dynamic_cars;

import main.java.factory.dynamic_cars.Exterior.Exterior;
import main.java.factory.dynamic_cars.Interior.Interior;

public interface Car {
    Exterior exterior();
    Interior interior();
    void description();
    Car create();
}

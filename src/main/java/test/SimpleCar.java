package main.java.test;

import main.java.test.Exterior.Exterior;
import main.java.test.Exterior.SimpleCarExterior;

public class SimpleCar implements Car {

    public Exterior exterior() {
        return new SimpleCarExterior();
    }
}

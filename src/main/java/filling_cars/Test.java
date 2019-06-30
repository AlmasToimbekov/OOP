package main.java.filling_cars;

import main.java.filling_cars.exterior.Wheel;

public class Test {
    public static void main(String[] args) {
        Car simpleCar = SimpleCar.getCar("Volga");
        System.out.println(simpleCar.description());

        Car sportCar = SportCar.getCar("Ferrari");
        System.out.println(sportCar.description());
    }
}

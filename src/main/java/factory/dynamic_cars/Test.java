package main.java.factory.dynamic_cars;

import main.java.factory.dynamic_cars.Exterior.Color;
import main.java.factory.dynamic_cars.Exterior.Engine;
import main.java.factory.dynamic_cars.Exterior.Wheel;
import main.java.factory.dynamic_cars.Interior.Seat;
import main.java.factory.dynamic_cars.Interior.Steering;

public class Test {
    public static void main(String[] args) {

        Car simpleCar = SimpleCar.getInstance("Lada").create();
        simpleCar.description(Car.PrintType.CYCLE);

        Car superCar = SuperCar.getInstance("Porshe").create();
        superCar.description(Car.PrintType.ITERATOR);

        Car builtCar = SimpleCar.getInstance("Zapor")
            .exterior()
            .setElement(Wheel.getInstance(3))
            .setElement(Color.getInstance("grey"))
            .setElement(Engine.getInstance(32, "broken"))
            .and()
            .interior()
            .setElement(Seat.getInstance(3))
            .setElement(Steering.getInstance("grey"))
            .and();
        builtCar.description(Car.PrintType.CYCLE);
    }
}
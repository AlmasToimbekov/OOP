package main.java.factory.pizza.simple_factory;

public class PepperoniPizza implements Pizza {
    @Override
    public Pizza create() {
        return new PepperoniPizza();
    }
}

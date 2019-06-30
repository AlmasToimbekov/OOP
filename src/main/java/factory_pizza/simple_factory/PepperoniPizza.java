package main.java.factory_pizza.simple_factory;

public class PepperoniPizza implements Pizza {
    @Override
    public Pizza create() {
        return new PepperoniPizza();
    }
}

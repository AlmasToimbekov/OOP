package main.java.factory.pizza.simple_factory;

public class CheesePizza implements Pizza {
    @Override
    public Pizza create() {
        return new CheesePizza();
    }
}

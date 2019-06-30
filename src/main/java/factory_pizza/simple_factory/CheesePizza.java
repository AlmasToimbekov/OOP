package main.java.factory_pizza.simple_factory;

public class CheesePizza implements Pizza {
    @Override
    public Pizza create() {
        return new CheesePizza();
    }
}

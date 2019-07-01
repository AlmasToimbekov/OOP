package main.java.factory.simple_factory;

public class CheesePizza implements Pizza {
    @Override
    public Pizza create() {
        return new CheesePizza();
    }
}

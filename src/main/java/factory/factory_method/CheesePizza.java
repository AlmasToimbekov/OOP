package main.java.factory.factory_method;

public class CheesePizza implements Pizza {
    @Override
    public Pizza create() {
        return new CheesePizza();
    }
}

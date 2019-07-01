package main.java.factory.factory_method;

public class PepperoniPizza implements Pizza {
    @Override
    public Pizza create() {
        return new PepperoniPizza();
    }
}

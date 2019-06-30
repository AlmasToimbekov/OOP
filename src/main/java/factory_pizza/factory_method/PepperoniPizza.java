package main.java.factory_pizza.factory_method;

public class PepperoniPizza implements Pizza {
    @Override
    public Pizza create() {
        return new PepperoniPizza();
    }
}

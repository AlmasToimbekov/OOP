package main.java.beverage_decorator;

public class HouseBlend extends Beverage {

    public HouseBlend() {
        description = "Home Blend Coffee";
    }

    public double cost() {
        return .89;
    }
}

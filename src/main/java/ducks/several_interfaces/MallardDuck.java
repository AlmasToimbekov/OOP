package main.java.ducks.several_interfaces;

public class MallardDuck implements Duck, Quackable, Flyable {
    @Override
    public void swim() {
        System.out.println("Mallard duck is swimming");
    }

    @Override
    public void display() {
        System.out.println("Mallard duck is displayed");

    }

    @Override
    public void quack() {
        System.out.println("Mallard duck is quacking");

    }

    @Override
    public void fly() {
        System.out.println("Mallard duck is flying");
    }
}

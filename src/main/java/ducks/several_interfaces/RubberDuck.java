package main.java.ducks.several_interfaces;

public class RubberDuck implements Duck, Quackable {
    @Override
    public void swim() {
        System.out.println("Rubber duck is swimming");
    }

    @Override
    public void display() {
        System.out.println("Rubber duck is displayed");

    }

    @Override
    public void quack() {
        System.out.println("Rubber duck is quacking");

    }
}

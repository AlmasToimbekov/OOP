package main.java.ducks.several_interfaces;

public class DecoyDuck implements Duck {
    @Override
    public void swim() {
        System.out.println("Decoy duck is swimming");
    }

    @Override
    public void display() {
        System.out.println("Decoy duck is displayed");

    }
}

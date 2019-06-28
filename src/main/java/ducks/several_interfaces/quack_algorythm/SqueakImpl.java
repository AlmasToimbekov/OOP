package main.java.ducks.several_interfaces.quack_algorythm;

public class SqueakImpl implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Squeak");
    }
}

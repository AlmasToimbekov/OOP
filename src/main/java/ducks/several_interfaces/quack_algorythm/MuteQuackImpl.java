package main.java.ducks.several_interfaces.quack_algorythm;

import main.java.ducks.several_interfaces.quack_algorythm.QuackBehavior;

public class MuteQuackImpl implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("<< Silence >>");
    }
}

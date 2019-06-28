package main.java.ducks.several_interfaces;

import main.java.ducks.several_interfaces.fly_algorythm.FlyWithWings;
import main.java.ducks.several_interfaces.quack_algorythm.QuackBehaviorImpl;

public class MallardDuck extends Duck {
    public MallardDuck() {
        quackBehavior = new QuackBehaviorImpl();
        flyBehavior = new FlyWithWings();
    }

    public void display() {
        System.out.println("I'm a real Mallard duck");

    }
}
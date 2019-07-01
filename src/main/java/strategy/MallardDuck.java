package main.java.strategy;

import main.java.strategy.fly_algorythm.FlyWithWings;
import main.java.strategy.quack_algorythm.QuackBehaviorImpl;

public class MallardDuck extends Duck {
    public MallardDuck() {
        quackBehavior = new QuackBehaviorImpl();
        flyBehavior = new FlyWithWings();
    }

    public void display() {
        System.out.println("I'm a real Mallard duck");

    }
}
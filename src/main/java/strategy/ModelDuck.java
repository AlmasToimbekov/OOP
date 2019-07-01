package main.java.strategy;

import main.java.strategy.fly_algorythm.FlyNoWay;
import main.java.strategy.quack_algorythm.QuackBehaviorImpl;

public class ModelDuck extends Duck {
    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new QuackBehaviorImpl();
    }

    @Override
    public void display() {
        System.out.println("I'm a model duck");
    }
}

package main.java.ducks.several_interfaces;

import main.java.ducks.several_interfaces.fly_algorythm.FlyNoWay;
import main.java.ducks.several_interfaces.quack_algorythm.QuackBehaviorImpl;

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

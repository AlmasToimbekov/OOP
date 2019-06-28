package main.java.ducks.several_interfaces;

import main.java.ducks.several_interfaces.fly_algorythm.FlyNoWay;
import main.java.ducks.several_interfaces.fly_algorythm.FlyRocketPowered;

public class StrategyTest {
    public static void main(String[] args) {
        Duck justDuck = new MallardDuck();
        justDuck.display();
        justDuck.performQuack();
        justDuck.performFly();
        justDuck.setFlyBehavior(new FlyNoWay());
        justDuck.performFly();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
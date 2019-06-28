package main.java.ducks.several_interfaces.fly_algorythm;

public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I can't fly");
    }
}

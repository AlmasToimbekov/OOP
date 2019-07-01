package main.java.strategy.fly_algorythm;

public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("Flying");
    }
}

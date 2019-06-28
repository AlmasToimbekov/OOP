package main.java.ducks.several_interfaces.fly_algorythm;

public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("Flying");
    }
}

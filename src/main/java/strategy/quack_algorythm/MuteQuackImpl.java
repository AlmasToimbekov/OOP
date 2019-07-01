package main.java.strategy.quack_algorythm;

public class MuteQuackImpl implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("<< Silence >>");
    }
}

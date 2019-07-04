package main.java.Adapter;

public class Test {
    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();
        Turkey turkey = new WildTurkey();
        Duck duckAdapter = new DuckAdapter(turkey);

        mallardDuck.fly();
        mallardDuck.quack();

        duckAdapter.fly();
        duckAdapter.quack();
    }
}

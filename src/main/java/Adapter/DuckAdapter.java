package main.java.Adapter;

public class DuckAdapter implements Duck {

    public DuckAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    private Turkey turkey;

    @Override
    public void quack() {
        turkey.gobble();
    }

    @Override
    public void fly() {
        turkey.fly();
    }
}

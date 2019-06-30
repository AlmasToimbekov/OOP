package main.java.filling_cars.exterior;

public class Engine {
    private int HP;

    private Engine(int HP) {
        this.HP = HP;
    }

    public static Engine getEngine(int HP) {
        return new Engine(HP);
    }

    public int getHP() {
        return HP;
    }
}

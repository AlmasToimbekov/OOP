package main.java.factory.filling_cars.exterior;

public class Engine {
    private int HP;

    private Engine(int HP) {
        this.HP = HP;
    }

    public static Engine getInstance(int HP) {
        return new Engine(HP);
    }

    public int getHP() {
        return HP;
    }
}

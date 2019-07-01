package main.java.test.Exterior;

public class Engine implements Elements {
    private String HP;

    private Engine(String HP) {
        this.HP = HP;
    }

    public static Engine getInstance(String HP) {
        return new Engine(HP);
    }

}

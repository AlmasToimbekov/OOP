package main.java.factory.dynamic_cars.Exterior;

public class Engine implements ExteriorElements {
    private int HP;
    private String status;

    private Engine(int HP, String status) {
        this.HP = HP;
        this.status = status;
    }

    public static Engine getInstance(int HP) {
        return new Engine(HP, null);
    }

    public static Engine getInstance(int HP, String status) {
        return new Engine(HP, status);
    }

    public String description() {
        return "Engine " + HP + " h.p." + (status == null ? "" : " and status is " + status);
    }
}

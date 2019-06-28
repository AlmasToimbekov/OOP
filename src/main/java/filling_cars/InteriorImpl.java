package main.java.filling_cars;

public class InteriorImpl implements Interior {
    private String Seat;
    private String Steering;

    private InteriorImpl() {}

    static Interior setInterior() {
        return new InteriorImpl();
    }

    @Override
    public Seat getSeat() {
        return null;
    }

    @Override
    public Steering getSteering() {
        return null;
    }
}

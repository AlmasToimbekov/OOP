package main.java.filling_cars.interior;

public class SimpleCarInterior extends InteriorImpl {

    private SimpleCarInterior(Seat seat, Steering steering) {
        super(seat, steering);
    }

    public static Interior setInterior() {
        return new SimpleCarInterior(Seat.getSeat(4), Steering.getSteering("black"));
    }
}

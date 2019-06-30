package main.java.filling_cars.interior;

public class SportCarInterior extends InteriorImpl {

    private SportCarInterior(Seat seat, Steering steering) {
        super(seat, steering);
    }

    public static Interior setInterior() {
        return new SportCarInterior(Seat.getSeat(2), Steering.getSteering("red"));
    }
}

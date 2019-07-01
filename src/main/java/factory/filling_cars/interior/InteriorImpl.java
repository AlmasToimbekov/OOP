package main.java.factory.filling_cars.interior;

public abstract class InteriorImpl implements Interior {
    private Seat seat;
    private Steering steering;

    protected InteriorImpl(Seat seat, Steering steering) {
        this.seat = seat;
        this.steering = steering;
    }

    @Override
    public Seat seat() {
        return this.seat;
    }

    @Override
    public Steering steering() {
        return this.steering;
    }
}

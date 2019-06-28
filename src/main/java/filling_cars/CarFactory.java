package main.java.filling_cars;

public class CarFactory implements Car {
    private String name;
    private Interior interior;
    private Exterior exterior;

    private CarFactory(String name) {
        this.name = name;
        this.exterior = ExteriorImpl.setExterior();
        this.interior = InteriorImpl.setInterior();
    }

    public static Car getCar(String name) {
        return new CarFactory(name);
    }

    @Override
    public Interior getInterior() {
        return this.interior;
    }

    @Override
    public Exterior getExterior() {
        return this.exterior;
    }

    public String getName() {
        return name;
    }
}

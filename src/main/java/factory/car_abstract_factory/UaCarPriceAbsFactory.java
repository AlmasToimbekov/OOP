package main.java.factory.car_abstract_factory;

class UaCarPriceAbsFactory implements InteAbsFactory {
    public Lada getLada() {
        return new UaLadaImpl();
    }
    public Ferrari getFerrari() {
        return new UaFerrariImpl();
    }
    public Porshe getPorshe() {
        return new UaPorsheImpl();
    }
}// первая

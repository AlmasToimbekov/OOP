package main.java.factory.abstract_factory.ingredients;

public class MozzarellaCheese implements Cheese {
    private String name = "Mozzarella cheese";

    @Override
    public Cheese cheese() {
        return this;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
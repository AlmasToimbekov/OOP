package main.java.factory_pizza.abstract_factory.ingredients;

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

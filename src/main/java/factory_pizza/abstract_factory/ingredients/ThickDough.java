package main.java.factory_pizza.abstract_factory.ingredients;

public class ThickDough implements Dough {
    private String name = "Thick dough";

    public Dough dough() {
        return this;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

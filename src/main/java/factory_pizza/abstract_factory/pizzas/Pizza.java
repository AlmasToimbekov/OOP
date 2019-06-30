package main.java.factory_pizza.abstract_factory.pizzas;

import main.java.factory_pizza.abstract_factory.ingredients.Cheese;
import main.java.factory_pizza.abstract_factory.ingredients.Dough;

public abstract class Pizza {
    String name;
    Dough dough;
    Cheese cheese;

    public abstract void prepare();

    public void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }

    public void cut() {
        System.out.println("Cutting pizza into diagonal slices");
    }

    public void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }

    public void string() {
        System.out.println("Ingredients: " + dough.getName() + ", " + cheese.getName());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

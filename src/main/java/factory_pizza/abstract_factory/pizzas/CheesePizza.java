package main.java.factory_pizza.abstract_factory.pizzas;

import main.java.factory_pizza.abstract_factory.ingredients.PizzaIngredient;

public class CheesePizza extends Pizza {
    PizzaIngredient ingredientFactory;

    public CheesePizza(PizzaIngredient ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing " + name);
        dough = ingredientFactory.createDough();
        cheese = ingredientFactory.createCheese();
    }
}

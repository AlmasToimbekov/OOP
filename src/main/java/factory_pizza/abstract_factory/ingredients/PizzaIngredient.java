package main.java.factory_pizza.abstract_factory.ingredients;

public interface PizzaIngredient {
    Dough createDough();
    Cheese createCheese();
}

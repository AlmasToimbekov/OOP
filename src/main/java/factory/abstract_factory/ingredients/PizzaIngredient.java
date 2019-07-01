package main.java.factory.abstract_factory.ingredients;

public interface PizzaIngredient {
    Dough createDough();
    Cheese createCheese();
}

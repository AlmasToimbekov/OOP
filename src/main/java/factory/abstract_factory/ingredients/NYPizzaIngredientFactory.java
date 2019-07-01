package main.java.factory.abstract_factory.ingredients;

public class NYPizzaIngredientFactory implements PizzaIngredient {
    @Override
    public Dough createDough() {
        return new ThinDough();
    }

    @Override
    public Cheese createCheese() {
        return new MozzarellaCheese();
    }
}

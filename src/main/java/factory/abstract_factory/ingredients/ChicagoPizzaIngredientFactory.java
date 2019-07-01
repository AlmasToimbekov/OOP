package main.java.factory.abstract_factory.ingredients;

public class ChicagoPizzaIngredientFactory implements PizzaIngredient {
    @Override
    public Dough createDough() {
        return new ThickDough();
    }

    @Override
    public Cheese createCheese() {
        return new ParmezanCheese();
    }
}

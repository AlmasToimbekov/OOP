package main.java.factory.abstract_factory;
import main.java.factory.abstract_factory.pizzas.Pizza;

public abstract class PizzaStore {

    public Pizza orderPizza(String type) {
        Pizza pizza;
        pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        pizza.string();

        return pizza;
    }

    abstract Pizza createPizza(String type);
}

package main.java.factory_pizza.abstract_factory;

import main.java.factory_pizza.abstract_factory.ingredients.ChicagoPizzaIngredientFactory;
import main.java.factory_pizza.abstract_factory.ingredients.NYPizzaIngredientFactory;
import main.java.factory_pizza.abstract_factory.ingredients.PizzaIngredient;
import main.java.factory_pizza.abstract_factory.pizzas.CheesePizza;
import main.java.factory_pizza.abstract_factory.pizzas.ClamPizza;
import main.java.factory_pizza.abstract_factory.pizzas.Pizza;

public class ChicagoPizzaFactory extends PizzaStore {

    protected Pizza createPizza(String item) {
//    !!! Compare to factory_method.NYPizzaStore
        Pizza pizza = null;
        PizzaIngredient ingredientFactory = new ChicagoPizzaIngredientFactory();

        if (item.equals("cheese")) {
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("Chicago Style Cheese Pizza");
        } else if (item.equals("clam")) {
            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("Chicago Style Clam Pizza");
        }
        return pizza;
    }
}

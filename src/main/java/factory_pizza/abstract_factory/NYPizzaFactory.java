package main.java.factory_pizza.abstract_factory;

import main.java.factory_pizza.abstract_factory.ingredients.NYPizzaIngredientFactory;
import main.java.factory_pizza.abstract_factory.ingredients.PizzaIngredient;
import main.java.factory_pizza.abstract_factory.pizzas.CheesePizza;
import main.java.factory_pizza.abstract_factory.pizzas.ClamPizza;
import main.java.factory_pizza.abstract_factory.pizzas.Pizza;

public class NYPizzaFactory extends PizzaStore {

    protected Pizza createPizza(String item) {
//    !!! Compare to factory_method.NYPizzaStore
        Pizza pizza = null;
        PizzaIngredient ingredientFactory = new NYPizzaIngredientFactory();

        if (item.equals("cheese")) {
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("New York Style Cheese Pizza");
        } else if (item.equals("clam")) {
            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("New York Style Clam Pizza");
        }
        return pizza;
    }
}

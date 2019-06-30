package main.java.factory_pizza.abstract_factory;

public class PizzaTest {
    public static void main(String[] args) {
        PizzaStore nyPizzaFactory = new NYPizzaFactory();
        nyPizzaFactory.orderPizza("cheese");

        System.out.println("\n");

        PizzaStore chicagoPizzaFactory = new ChicagoPizzaFactory();
        chicagoPizzaFactory.orderPizza("cheese");
    }
}

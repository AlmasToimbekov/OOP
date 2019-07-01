package main.java.factory.factory_method;

public class NYStyleCheesePizza extends CheesePizza {
    public static void makeOrder() {
        PizzaStore factory = new NYPizzaStore();
        Pizza pizza = factory.createPizza("cheese");
        System.out.println(pizza.getClass());
    }
}

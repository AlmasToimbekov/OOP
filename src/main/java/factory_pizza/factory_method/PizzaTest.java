package main.java.factory_pizza.factory_method;

public class PizzaTest {
    public static void main(String[] args) {
        PizzaStore factory = new NYPizzaStore();
        Pizza pepperoni = factory.createPizza("pepperoni");
        System.out.println(pepperoni.getClass());

        NYStyleCheesePizza.makeOrder();
    }
}

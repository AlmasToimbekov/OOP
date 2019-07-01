package main.java.factory.simple_factory;

public class SimplePizzaTest {
    public static void main(String[] args) {
        SimplePizzaFactory factory = new SimplePizzaFactory();
        Pizza pepperoni = factory.createPizza("pepperoni");
        System.out.println(pepperoni.getClass());
    }
}

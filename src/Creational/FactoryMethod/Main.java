package Creational.FactoryMethod;

public class Main {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();

        System.out.println("Order #1: Cheese Pizza");
        nyStore.orderPizza("cheese");

        System.out.println("\nOrder #2: Pepperoni Pizza");
        nyStore.orderPizza("pepperoni");

        System.out.println("\nOrder #3: Veggie Pizza");
        nyStore.orderPizza("veggie");

        System.out.println("\nOrder #4: Unknown Pizza");
        nyStore.orderPizza("unknown");
    }
}

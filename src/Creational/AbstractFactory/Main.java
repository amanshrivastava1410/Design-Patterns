package Creational.AbstractFactory;

import Creational.AbstractFactory.Store.PizzaStore;
import Creational.AbstractFactory.Store.NYPizzaStore;
import Creational.AbstractFactory.Store.ChicagoPizzaStore;

public class Main {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        System.out.println("Order from NY Store:");
        nyStore.orderPizza("cheese");

        System.out.println("\nOrder from Chicago Store:");
        chicagoStore.orderPizza("cheese");
    }
}

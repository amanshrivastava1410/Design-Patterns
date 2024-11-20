package Creational.FactoryMethod;

import Creational.FactoryMethod.Pizza.Pizza;

public abstract class PizzaStore {
    public Pizza orderPizza(String type) {
        Pizza pizza = createPizza(type);

        if (pizza != null) {
            pizza.prepare();
            pizza.bake();
            pizza.cut();
        } else {
            System.out.println("Sorry, we don't serve this type of pizza.");
        }

        return pizza;
    }

    protected abstract Pizza createPizza(String type);
}

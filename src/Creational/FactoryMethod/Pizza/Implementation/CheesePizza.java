package Creational.FactoryMethod.Pizza.Implementation;

import Creational.FactoryMethod.Pizza.Pizza;

public class CheesePizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("Preparing Cheese Pizza.");
    }

    @Override
    public void bake() {
        System.out.println("Baking Cheese Pizza.");
    }

    @Override
    public void cut() {
        System.out.println("Cutting Cheese Pizza.");
    }
}

package Creational.FactoryMethod.Pizza.Implementation;

import Creational.FactoryMethod.Pizza.Pizza;

public class PepperoniPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("Preparing Pepperoni Pizza.");
    }

    @Override
    public void bake() {
        System.out.println("Baking Pepperoni Pizza.");
    }

    @Override
    public void cut() {
        System.out.println("Cutting Pepperoni Pizza.");
    }
}

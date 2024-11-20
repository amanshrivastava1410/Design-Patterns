package Creational.AbstractFactory.Pizza;

import Creational.AbstractFactory.Factory.PizzaIngredientFactory;

public abstract class Pizza {
    protected PizzaIngredientFactory ingredientFactory;

    public Pizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    public abstract void prepare();

    public void bake() {
        System.out.println("Baking Pizza.");
    }

    public void cut() {
        System.out.println("Cutting Pizza.");
    }
}

package Creational.AbstractFactory.Pizza;

import Creational.AbstractFactory.Factory.PizzaIngredientFactory;

public class CheesePizza extends Pizza {
    public CheesePizza(PizzaIngredientFactory ingredientFactory) {
        super(ingredientFactory);
    }

    @Override
    public void prepare() {
        System.out.println("Preparing Cheese Pizza with " +
            ingredientFactory.createCheese() + " and " +
            ingredientFactory.createSauce());
    }
}

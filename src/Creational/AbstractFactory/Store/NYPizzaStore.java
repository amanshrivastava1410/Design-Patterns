package Creational.AbstractFactory.Store;

import Creational.AbstractFactory.Factory.NYPizzaIngredientFactory;
import Creational.AbstractFactory.Factory.PizzaIngredientFactory;
import Creational.AbstractFactory.Pizza.CheesePizza;
import Creational.AbstractFactory.Pizza.Pizza;

public class NYPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();

        if (type.equalsIgnoreCase("cheese")) {
            pizza = new CheesePizza(ingredientFactory);
        }
        return pizza;
    }
}

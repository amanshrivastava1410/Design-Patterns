package Creational.AbstractFactory.Store;

import Creational.AbstractFactory.Factory.ChicagoPizzaIngredientFactory;
import Creational.AbstractFactory.Factory.PizzaIngredientFactory;
import Creational.AbstractFactory.Pizza.CheesePizza;
import Creational.AbstractFactory.Pizza.Pizza;

public class ChicagoPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new ChicagoPizzaIngredientFactory();

        if (type.equalsIgnoreCase("cheese")) {
            pizza = new CheesePizza(ingredientFactory);
        }
        return pizza;
    }
}

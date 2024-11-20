package Creational.FactoryMethod;

import Creational.FactoryMethod.Pizza.Pizza;
import Creational.FactoryMethod.Pizza.Implementation.CheesePizza;
import Creational.FactoryMethod.Pizza.Implementation.PepperoniPizza;
import Creational.FactoryMethod.Pizza.Implementation.VeggiePizza;

public class NYPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        if (type.equalsIgnoreCase("cheese")) {
            return new CheesePizza();
        } else if (type.equalsIgnoreCase("pepperoni")) {
            return new PepperoniPizza();
        } else if (type.equalsIgnoreCase("veggie")) {
            return new VeggiePizza();
        } else {
            return null;
        }
    }
}

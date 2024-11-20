package Creational.AbstractFactory.Factory;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public String createCheese() {
        return "Cheddar Cheese.";
    }

    @Override
    public String createSauce() {
        return "Plum Tomato Sauce.";
    }
}
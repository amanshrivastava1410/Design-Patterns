package Creational.AbstractFactory.Factory;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public String createCheese() {
        return "Mozzarella Cheese.";
    }

    @Override
    public String createSauce() {
        return "Marinara Sauce.";
    }
}
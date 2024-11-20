package Structural.Decorator;

public class Main {
    public static void main(String[] args) {
        Coffee basicCoffee = new BasicCoffee();
        System.out.println("Cost of basic coffee: " + basicCoffee.cost());

        Coffee milkCoffee = new MilkDecorator(basicCoffee);
        System.out.println("Cost of coffee with milk: " + milkCoffee.cost());

        Coffee milkSugarCoffee = new SugarDecorator(milkCoffee);
        System.out.println("Cost of coffee with milk and sugar: " + milkSugarCoffee.cost());
    }
}

package Structural.Decorator;

public class SugarDecorator extends CoffeeDecorator {

    public SugarDecorator(Coffee decoratedCoffee) {
        super(decoratedCoffee);
    }

    @Override
    public double cost() {
        return decoratedCoffee.cost() + 0.5;
    }
}

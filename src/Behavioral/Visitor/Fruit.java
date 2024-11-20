package Behavioral.Visitor;

public class Fruit implements Item {
    private double price;

    public Fruit(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}

package Behavioral.Visitor;

public class Book implements Item {
    private double price;

    public Book(double price) {
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

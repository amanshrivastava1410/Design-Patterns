package Behavioral.Visitor;

public class TaxVisitor implements Visitor {

    private static final double BOOK_TAX_RATE = 0.05;
    private static final double FRUIT_TAX_RATE = 0.03;
    private static final double ELECTRONICS_TAX_RATE = 0.15;
    
    @Override
    public void visit(Book book) {
        double tax = book.getPrice() * BOOK_TAX_RATE;
        System.out.println("Tax on Book: Rs " + tax);
    }

    @Override
    public void visit(Fruit fruit) {
        double tax = fruit.getPrice() * FRUIT_TAX_RATE;
        System.out.println("Tax on Fruit: Rs " + tax);
    }

    @Override
    public void visit(Electronics electronics) {
        double tax = electronics.getPrice() * ELECTRONICS_TAX_RATE;
        System.out.println("Tax on Electronics: Rs " + tax);
    }
}

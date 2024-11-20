package Behavioral.Visitor;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Item> items = new ArrayList<>();

    public void addItem(Item item) {
        items.add(item);
    }

    public void applyTax(Visitor visitor) {
        for (Item item : items) {
            item.accept(visitor);
        }
    }

    public static void main(String[] args) {
        Item book = new Book(100);
        Item fruit = new Fruit(50);
        Item electronics = new Electronics(200);

        ShoppingCart cart = new ShoppingCart();
        cart.addItem(book);
        cart.addItem(fruit);
        cart.addItem(electronics);

        TaxVisitor taxVisitor = new TaxVisitor();
        cart.applyTax(taxVisitor);
    }
}


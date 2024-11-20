package Behavioral.Iterator;

import java.util.ArrayList;
import java.util.List;

public class BookCollection implements Aggregate {
    private List<String> books;

    public BookCollection() {
        books = new ArrayList<>();
    }

    public void addBook(String book) {
        books.add(book);
    }

    @Override
    public Iterator createIterator() {
        return new BookIterator(books);
    }
}

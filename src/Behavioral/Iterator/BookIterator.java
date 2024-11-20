package Behavioral.Iterator;

import java.util.List;

public class BookIterator implements Iterator {
    private List<String> books;
    private int position;

    public BookIterator(List<String> books) {
        this.books = books;
        this.position = 0;
    }

    @Override
    public boolean hasNext() {
        return position < books.size();
    }

    @Override
    public Object next() {
        if (hasNext()) {
            return books.get(position++);
        }
        return null;
    }
}

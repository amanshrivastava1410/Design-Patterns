package Behavioral.Iterator;

public class Main {
    public static void main(String[] args) {

        BookCollection bookCollection = new BookCollection();
        bookCollection.addBook("Thousand Splendid Suns");
        bookCollection.addBook("Fault In Our Stars");
        bookCollection.addBook("The Kite Runner");
        
        Iterator iterator = bookCollection.createIterator();
        
        System.out.println("Books in the collection are:");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}

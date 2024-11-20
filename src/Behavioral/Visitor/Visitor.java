package Behavioral.Visitor;

public interface Visitor {
    void visit(Book book);
    void visit(Fruit fruit);
    void visit(Electronics electronics);
}

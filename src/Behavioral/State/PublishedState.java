package Behavioral.State;

public class PublishedState implements State {
    @Override
    public void handleRequest() {
        System.out.println("The document is in the PUBLISHED state. It's now visible to users.");
    }
}

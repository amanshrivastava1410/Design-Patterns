package Behavioral.State;

public class DraftState implements State {
    @Override
    public void handleRequest() {
        System.out.println("The document is in the DRAFT state. You can edit it.");
    }
}

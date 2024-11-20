package Behavioral.State;

public class DocumentContext {
    private State currentState;

    public void setState(State state) {
        this.currentState = state;
    }

    public void applyState() {
        if (currentState != null) {
            currentState.handleRequest();
        } else {
            System.out.println("The document has no state set.");
        }
    }
}

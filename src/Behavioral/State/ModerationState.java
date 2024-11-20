package Behavioral.State;

public class ModerationState implements State {
    @Override
    public void handleRequest() {
        System.out.println("The document is in the MODERATION state. Review pending.");
    }
}

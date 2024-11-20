package Behavioral.State;

public class Main {
    public static void main(String[] args) {
        DocumentContext document = new DocumentContext();

        State draftState = new DraftState();
        System.out.println("Switching to Draft State:");
        document.setState(draftState);
        document.applyState();

        State moderationState = new ModerationState();
        System.out.println("\nSwitching to Moderation State:");
        document.setState(moderationState);
        document.applyState();

        State publishedState = new PublishedState();
        System.out.println("\nSwitching to Published State:");
        document.setState(publishedState);
        document.applyState();
    }
}

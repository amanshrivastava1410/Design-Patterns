package Behavioral.ChainOfResponsibility;

public class MediumLevelSupportHandler extends SupportHandler {

    @Override
    public void handleRequest(String level) {
        if (level.equalsIgnoreCase("medium")) {
            System.out.println("Medium-level support handled.");
        } else if (nextHandler != null) {
            nextHandler.handleRequest(level);
        } else {
            handleUnsupportedRequest(level);
        }
    }
}
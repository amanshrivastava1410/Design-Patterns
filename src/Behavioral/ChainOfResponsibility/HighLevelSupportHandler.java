package Behavioral.ChainOfResponsibility;

public class HighLevelSupportHandler extends SupportHandler {

    @Override
    public void handleRequest(String level) {
        if (level.equalsIgnoreCase("high")) {
            System.out.println("High-level support handled.");
        } else if (nextHandler != null) {
            nextHandler.handleRequest(level);
        } else {
            handleUnsupportedRequest(level);
        }
    }
}
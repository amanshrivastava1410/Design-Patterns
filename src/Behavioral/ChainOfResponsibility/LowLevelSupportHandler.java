package Behavioral.ChainOfResponsibility;

public class LowLevelSupportHandler extends SupportHandler {

    @Override
    public void handleRequest(String level) {
        if (level.equalsIgnoreCase("low")) {
            System.out.println("Low-level support handled.");
        } else if (nextHandler != null) {
            nextHandler.handleRequest(level);
        } else {
            handleUnsupportedRequest(level);
        }
    }
}
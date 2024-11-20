package Behavioral.ChainOfResponsibility;

public abstract class SupportHandler {
    protected SupportHandler nextHandler;

    public void setNextHandler(SupportHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public abstract void handleRequest(String level);

    protected void handleUnsupportedRequest(String level) {
        System.out.println("No handler available for: " + level);
    }
}
package Behavioral.ChainOfResponsibility;

public class Main {
    public static void main(String[] args) {
        SupportHandler lowLevHandler = new LowLevelSupportHandler();
        SupportHandler mediumLevHandler = new MediumLevelSupportHandler();
        SupportHandler highLevHandler = new HighLevelSupportHandler();

        lowLevHandler.setNextHandler(mediumLevHandler);
        mediumLevHandler.setNextHandler(highLevHandler);

        System.out.println("Requesting low-level support:");
        lowLevHandler.handleRequest("low");

        System.out.println("\nRequesting medium-level support:");
        lowLevHandler.handleRequest("medium");

        System.out.println("\nRequesting high-level support:");
        lowLevHandler.handleRequest("high");

        System.out.println("\nRequesting unsupported level:");
        lowLevHandler.handleRequest("urgent");
    }
}
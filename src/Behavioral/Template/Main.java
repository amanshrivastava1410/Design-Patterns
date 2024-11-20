package Behavioral.Template;

public class Main {
    public static void main(String[] args) {
        Game cricket = new Cricket();
        Game football = new Football();

        System.out.println("Playing Cricket:");
        cricket.play();

        System.out.println("\nPlaying Football:");
        football.play();
    }
}

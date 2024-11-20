package Creational.Singleton;

public class Main {
    public static void main(String[] args) {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();

        System.out.println("Are both instances the same? " + (instance1 == instance2));

        instance1.showMessage();
    }
}

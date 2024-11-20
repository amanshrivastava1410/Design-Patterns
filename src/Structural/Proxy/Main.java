package Structural.Proxy;

public class Main {
    public static void main(String[] args) {
        RealBankAccount realAccount = new RealBankAccount(1000);

        BankAccount adminProxy = new ProtectionProxy(realAccount, "ADMIN");
        BankAccount userProxy = new ProtectionProxy(realAccount, "USER");
        BankAccount guestProxy = new ProtectionProxy(realAccount, "GUEST");

        System.out.println("Admin's Actions:");
        adminProxy.checkBalance();
        adminProxy.withdraw(500);

        System.out.println("\nUser's Actions:");
        userProxy.checkBalance();
        userProxy.withdraw(200);

        System.out.println("\nGuest's Actions:");
        guestProxy.checkBalance();
        guestProxy.withdraw(100);
    }
}

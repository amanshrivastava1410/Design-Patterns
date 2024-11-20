package Structural.Proxy;

public class ProtectionProxy implements BankAccount {
    private RealBankAccount realBankAccount;
    private String userRole;

    public ProtectionProxy(RealBankAccount realBankAccount, String userRole) {
        this.realBankAccount = realBankAccount;
        this.userRole = userRole;
    }

    @Override
    public void checkBalance() {
        realBankAccount.checkBalance();
    }

    @Override
    public void withdraw(double amount) {
        if (userRole.equals("ADMIN") || userRole.equals("USER")) {
            realBankAccount.withdraw(amount);
        } else {
            System.out.println("Access denied: You are not authorized to withdraw money.");
        }
    }
}

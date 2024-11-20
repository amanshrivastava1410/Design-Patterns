package Structural.Proxy;


public class RealBankAccount implements BankAccount {
    private double balance;

    public RealBankAccount(double balance) {
        this.balance = balance;
    }

    @Override
    public void checkBalance() {
        System.out.println("The current balance is: Rs " + balance);
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful.");
            System.out.println("New balance: Rs " + balance);
        } else {
            System.out.println("Insufficient balance for withdrawal.");
        }
    }
}
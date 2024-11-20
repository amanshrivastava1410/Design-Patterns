package Structural.Adapter;

public class CreditCardAdapter implements PaymentGateway {
    private CreditCardProcessor creditCardProcessor;

    public CreditCardAdapter() {
        creditCardProcessor = new CreditCardProcessor();
    }

    @Override
    public void processPayment(double amount) {
        creditCardProcessor.charge(amount);
    }
}
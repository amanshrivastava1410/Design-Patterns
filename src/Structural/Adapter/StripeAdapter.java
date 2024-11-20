package Structural.Adapter;

public class StripeAdapter implements PaymentGateway {
    private StripeService stripeService;

    public StripeAdapter() {
        stripeService = new StripeService();
    }

    @Override
    public void processPayment(double amount) {
        stripeService.initiatePayment(amount);
    }
}
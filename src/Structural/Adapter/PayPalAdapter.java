package Structural.Adapter;

public class PayPalAdapter implements PaymentGateway {
    private PayPalService payPalService;

    public PayPalAdapter() {
        payPalService = new PayPalService();
    }

    @Override
    public void processPayment(double amount) {
        payPalService.makePayment(amount);
    }
}
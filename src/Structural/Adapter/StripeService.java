package Structural.Adapter;

public class StripeService {
    public void initiatePayment(double amount) {
        System.out.println("Processing payment through Stripe: " + amount);
    }
}
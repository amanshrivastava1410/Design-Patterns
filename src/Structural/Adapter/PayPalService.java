package Structural.Adapter;

public class PayPalService {
    public void makePayment(double amount) {
        System.out.println("Processing payment through PayPal: " + amount);
    }
}
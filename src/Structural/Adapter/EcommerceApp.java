package Structural.Adapter;

public class EcommerceApp {
    public static void main(String[] args) {
        PaymentGateway payPalGateway = new PayPalAdapter();
        payPalGateway.processPayment(100.0);
        
        System.out.println();
       
        PaymentGateway stripeGateway = new StripeAdapter();
        stripeGateway.processPayment(150.0);
        
        System.out.println();
        
        PaymentGateway creditCardGateway = new CreditCardAdapter();
        creditCardGateway.processPayment(200.0);
    }
}
package org.ltsai;

public class StripeAdapter implements PaymentAdapter {
    private StripePayment stripePayment = new StripePayment();

    public StripeAdapter(StripePayment stripePayment) {
        this.stripePayment = stripePayment;
    }

    @Override
    public void processPayment(double amount){
        stripePayment.doPayment(amount);
    }
}

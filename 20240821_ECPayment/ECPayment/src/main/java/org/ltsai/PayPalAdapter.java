package org.ltsai;

public class PayPalAdapter implements PaymentAdapter {
    private PayPalPayment payPalPayment;

    public PayPalAdapter(PayPalPayment payPalPayment) {
        this.payPalPayment = payPalPayment;
    }

    @Override
    public void processPayment(double amount){
        payPalPayment.makePayment(amount);
    }
}

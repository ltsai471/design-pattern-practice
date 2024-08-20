package org.ltsai;

public class Main {
    public static void main(String[] args) {
        PayPalPayment payPalPayment = new PayPalPayment();
        PaymentAdapter paypal = new PayPalAdapter(payPalPayment);
        paypal.processPayment(800);

        AlipayPayment alipayPayment = new AlipayPayment();
        PaymentAdapter alipay = new AlipayAdapter(alipayPayment);
        alipay.processPayment(6400);
    }
}
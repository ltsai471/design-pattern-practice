package org.ltsai;

public class AlipayAdapter implements PaymentAdapter {
    private AlipayPayment alipayPayment = new AlipayPayment();

    public AlipayAdapter(AlipayPayment alipayPayment) {
        this.alipayPayment = alipayPayment;
    }

    @Override
    public void processPayment(double amount){
        alipayPayment.sentPayment(amount);
    }
}

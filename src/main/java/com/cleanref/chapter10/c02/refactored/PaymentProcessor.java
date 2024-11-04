package com.cleanref.chapter10.c02.refactored;

public class PaymentProcessor {
    public void processPayment(PaymentMethod paymentMethod) {
        paymentMethod.processPayment();
    }
}
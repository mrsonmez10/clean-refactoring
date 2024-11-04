package com.cleanref.chapter10.c02.refactored;

public class PaypalPayment implements PaymentMethod {
    @Override
    public void processPayment() {
        System.out.println("Processing PayPal payment...");
    }
}
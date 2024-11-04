package com.cleanref.chapter10.c02;

public class PaymentProcessor {
    public void processPayment(String paymentType) {
        if (paymentType.equals("creditCard")) {
            System.out.println("Processing credit card payment...");
        } else if (paymentType.equals("paypal")) {
            System.out.println("Processing PayPal payment...");
        } else if (paymentType.equals("bankTransfer")) {
            System.out.println("Processing bank transfer payment...");
        } else {
            System.out.println("Unsupported payment type.");
        }
    }
}


package com.cleanref.chapter10.c02.refactored;

public class BankTransferPayment implements PaymentMethod {
    @Override
    public void processPayment() {
        System.out.println("Processing bank transfer payment...");
        // Banka havalesi ödeme işlemleri
    }
}

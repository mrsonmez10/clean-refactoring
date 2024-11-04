package com.cleanref.chapter10.c02.refactored;

public class TestDrive {

    public static void main(String[] args) {
        PaymentProcessor processor = new PaymentProcessor();

        PaymentMethod creditCard = new CreditCardPayment();
        PaymentMethod paypal = new PaypalPayment();
        PaymentMethod bankTransfer = new BankTransferPayment();

        processor.processPayment(creditCard);
        processor.processPayment(paypal);
        processor.processPayment(bankTransfer);
    }

}

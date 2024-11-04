package com.cleanref.chapter11.c01;

class SavingsAccount extends BankAccount {

    public SavingsAccount(double balance) {
        super(balance);
    }

    @Override
    public double calculateInterest() {
        return balance * 0.03; // %3 faiz oranı
    }
}
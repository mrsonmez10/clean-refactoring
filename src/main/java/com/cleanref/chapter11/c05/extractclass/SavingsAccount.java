package com.cleanref.chapter11.c05.extractclass;

class SavingsAccount extends BankAccount {

    public SavingsAccount(double balance) {
        super(balance);
    }

    public void addInterest() {
        balance += balance * 0.03; // %3 faiz ekleme
    }
}

package com.cleanref.chapter11.c01.pullup;

class SavingsAccount extends BankAccount {

    public SavingsAccount(double balance) {
        super(balance, 0.03); // %3 faiz oranı
    }
}

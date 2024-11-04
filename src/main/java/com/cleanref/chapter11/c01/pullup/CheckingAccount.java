package com.cleanref.chapter11.c01.pullup;

class CheckingAccount extends BankAccount {

    public CheckingAccount(double balance) {
        super(balance, 0.01); // %1 faiz oranı
    }
}

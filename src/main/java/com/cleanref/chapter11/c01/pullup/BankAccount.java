package com.cleanref.chapter11.c01.pullup;

abstract class BankAccount {
    protected double balance;
    protected double interestRate;

    public BankAccount(double balance, double interestRate) {
        this.balance = balance;
        this.interestRate = interestRate;
    }

    // Tek bir faiz hesaplama metodu üst sınıfa çekildi
    public double calculateInterest() {
        return balance * interestRate;
    }
}
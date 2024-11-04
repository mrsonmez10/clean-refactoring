package com.cleanref.chapter11.c01;

abstract class BankAccount {
    protected double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public abstract double calculateInterest();
}
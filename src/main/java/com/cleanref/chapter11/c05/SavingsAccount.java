package com.cleanref.chapter11.c05;

class SavingsAccount {
    private double balance;

    public SavingsAccount(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Yetersiz bakiye.");
        }
    }

    public void addInterest() {
        balance += balance * 0.03; // %3 faiz ekleme
    }
}
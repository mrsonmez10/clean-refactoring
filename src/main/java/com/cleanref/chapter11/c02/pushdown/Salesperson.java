package com.cleanref.chapter11.c02.pushdown;

class Salesperson extends Employee {

    public Salesperson(String name) {
        super(name);
    }

    // Artık sadece Salesperson sınıfında bulunan komisyon hesaplama metodu
    public double calculateSalesCommission(double sales) {
        return sales * 0.1; // %10 komisyon
    }
}
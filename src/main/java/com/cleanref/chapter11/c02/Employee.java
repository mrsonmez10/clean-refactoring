package com.cleanref.chapter11.c02;

abstract class Employee {
    protected String name;

    public Employee(String name) {
        this.name = name;
    }

    public double calculateSalesCommission(double sales) {
        return sales * 0.1; // %10 komisyon
    }
}

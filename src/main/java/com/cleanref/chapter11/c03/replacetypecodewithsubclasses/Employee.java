package com.cleanref.chapter11.c03.replacetypecodewithsubclasses;

abstract class Employee {
    protected double salary;

    public Employee(double salary) {
        this.salary = salary;
    }

    public abstract double calculateBonus();
}
package com.cleanref.chapter11.c03.replacetypecodewithsubclasses;

class Manager extends Employee {

    public Manager(double salary) {
        super(salary);
    }

    @Override
    public double calculateBonus() {
        return salary * 0.2;
    }
}
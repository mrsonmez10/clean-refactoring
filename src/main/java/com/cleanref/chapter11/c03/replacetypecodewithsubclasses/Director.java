package com.cleanref.chapter11.c03.replacetypecodewithsubclasses;

class Director extends Employee {

    public Director(double salary) {
        super(salary);
    }

    @Override
    public double calculateBonus() {
        return salary * 0.3;
    }
}

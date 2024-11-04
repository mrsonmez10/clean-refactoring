package com.cleanref.chapter11.c03.replacetypecodewithsubclasses;

class Engineer extends Employee {

    public Engineer(double salary) {
        super(salary);
    }

    @Override
    public double calculateBonus() {
        return salary * 0.1;
    }
}

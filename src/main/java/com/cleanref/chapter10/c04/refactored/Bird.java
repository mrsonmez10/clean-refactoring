package com.cleanref.chapter10.c04.refactored;

class Bird implements Eatable, Sleepable, Flyable {
    @Override
    public void eat() {
        System.out.println("Bird is eating.");
    }

    @Override
    public void sleep() {
        System.out.println("Bird is sleeping.");
    }

    @Override
    public void fly() {
        System.out.println("Bird is flying.");
    }
}
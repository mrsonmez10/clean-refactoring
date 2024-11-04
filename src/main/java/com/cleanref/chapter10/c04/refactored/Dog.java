package com.cleanref.chapter10.c04.refactored;

class Dog implements Eatable, Sleepable {
    @Override
    public void eat() {
        System.out.println("Dog is eating.");
    }

    @Override
    public void sleep() {
        System.out.println("Dog is sleeping.");
    }
}

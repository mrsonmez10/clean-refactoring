package com.cleanref.chapter10.c04;

class Bird implements Animal {
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

    @Override
    public void swim() {
        // Kuşlar yüzmeyebilir
        throw new UnsupportedOperationException("Birds can't swim.");
    }
}

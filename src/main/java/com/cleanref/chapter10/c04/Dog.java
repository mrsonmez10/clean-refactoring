package com.cleanref.chapter10.c04;

class Dog implements Animal {
    @Override
    public void eat() {
        System.out.println("Dog is eating.");
    }

    @Override
    public void sleep() {
        System.out.println("Dog is sleeping.");
    }

    @Override
    public void fly() {
        // Köpekler uçamaz
        throw new UnsupportedOperationException("Dogs can't fly.");
    }

    @Override
    public void swim() {
        System.out.println("Dog is swimming.");
    }
}
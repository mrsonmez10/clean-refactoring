package com.cleanref.chapter03.c05.creational.builder;

public class Person {

    private String identityNumber;
    private String name;
    private String surname;
    private Integer age;
    private Integer gender;

    public Person() {

    }

    public Person(String identityNumber, String name, String surname, Integer age, Integer gender) {
        this.identityNumber = identityNumber;
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.gender = gender;
    }
}
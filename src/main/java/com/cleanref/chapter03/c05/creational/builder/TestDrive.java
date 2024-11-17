package com.cleanref.chapter03.c05.creational.builder;

public class TestDrive {

    public static void main(String[] args) {
        PersonRefactored person = new PersonRefactored.Builder()
                .identityNumber("12345")
                .name("nicholai")
                .surname("Hell")
                .age(35)
                .gender(1)
                .build();

        System.out.println(person);

        PersonRefactored person2 = new PersonRefactored.Builder("45678", "ABC")
                .surname("DEF")
                .age(3)
                .gender(1)
                .build();

        System.out.println(person2);
    }

    // LOMBOK: https://projectlombok.org/features/Data

}

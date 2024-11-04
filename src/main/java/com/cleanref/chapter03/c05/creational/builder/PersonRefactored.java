package com.cleanref.chapter03.c05.creational.builder;

public class PersonRefactored {

    private String identityNumber;
    private String name;
    private String surname;
    private Integer age;
    private Integer gender;

    public PersonRefactored(String identityNumber, String name, String surname, Integer age, Integer gender) {
        this.identityNumber = identityNumber;
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.gender = gender;
    }

    public static class Builder {
        private String identityNumber;
        private String name;
        private String surname;
        private Integer age;
        private Integer gender;

        public Builder(){}

        public Builder(String identityNumber, String name){
            this.identityNumber = identityNumber;
            this.name = name;
        }

        public Builder identityNumber(String identityNumber) {
            this.identityNumber = identityNumber;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder surname(String surname) {
            this.surname = surname;
            return this;
        }

        public Builder age(Integer age) {
            this.age = age;
            return this;
        }

        public Builder gender(Integer gender) {
            this.gender = gender;
            return this;
        }

        public PersonRefactored build() {
            return new PersonRefactored(identityNumber, name, surname, age, gender);
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "identityNumber='" + identityNumber + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
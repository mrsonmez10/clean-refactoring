package com.cleanref.chapter11.c03;

class Employee {
    public static final int ENGINEER = 1;
    public static final int MANAGER = 2;
    public static final int DIRECTOR = 3;

    private int type;
    private double salary;

    public Employee(int type, double salary) {
        this.type = type;
        this.salary = salary;
    }

    public double calculateBonus() {
        switch (type) {
            case ENGINEER:
                return salary * 0.1;
            case MANAGER:
                return salary * 0.2;
            case DIRECTOR:
                return salary * 0.3;
            default:
                throw new IllegalArgumentException("Geçersiz çalışan türü");
        }
    }
}

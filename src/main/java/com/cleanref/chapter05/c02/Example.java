package com.cleanref.chapter05.c02;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Example {

    private final DbOperations dbOperations;

    public void updateEmployee() {
        Employee employee = dbOperations.getEmployee();

        // Check to see if the employee is eligible for full benefits
        if (employee.getAge() > 21 && employee.isPrimeCustomer()) {
            dbOperations.updateEmployee(employee);
        }
    }

}

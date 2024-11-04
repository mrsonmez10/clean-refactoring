package com.cleanref.chapter05.c02;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class UpdatedExample {
    private final DbOperations dbOperations;

    public void updateEmployee() {
        Employee employee = dbOperations.getEmployee();

        // Check to see if the employee is eligible for full benefits
        if (isEligibleForFullBenefits(employee)) {
            dbOperations.updateEmployee(employee);
        }
    }

    private boolean isEligibleForFullBenefits(Employee employee) {
        return employee.getAge() > 21 && employee.isPrimeCustomer();
    }
}

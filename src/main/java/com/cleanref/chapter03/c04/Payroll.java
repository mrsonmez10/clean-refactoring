package com.cleanref.chapter03.c04;

public class Payroll {

    // Single Response?, OpenClose?
    public Money calculatePay(Employee e) {
        switch (e) {
            case PARTTIME:
                return partTimePay(e);
            case HOURLY:
                return calculateHourlyPay(e);
            case SALARIED:
                return calculateSalariedPay(e);
            default:
                return null;
        }
    }

    // Java Optional.. Do not return null! -- Code contract<x,e>
    private Money calculateSalariedPay(Employee e) {
        return null;
    }

    private Money calculateHourlyPay(Employee e) {
        return null;
    }

    private Money partTimePay(Employee e) {
        /*

         */
        return null;
    }

}

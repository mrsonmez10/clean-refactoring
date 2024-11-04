package com.cleanref.chapter03.c05.structural;

class BillPaymentService {
    public void payBill(String accountId, String billId, double amount) {
        System.out.println("Paying bill " + billId + " from account " + accountId + " with amount " + amount);
    }

}

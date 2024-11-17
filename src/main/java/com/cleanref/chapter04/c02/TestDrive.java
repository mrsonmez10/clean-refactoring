package com.cleanref.chapter04.c02;

import com.cleanref.chapter04.c02.support.DbOperations;
import com.cleanref.chapter04.c02.support.ThirdPartyService;

public class TestDrive {
    // TODO together

    final DbOperations dbOperations;
    final ThirdPartyService thirdPartyService;

    public TestDrive(DbOperations dbOperations, ThirdPartyService thirdPartyService) {
        this.dbOperations = dbOperations;
        this.thirdPartyService = thirdPartyService;
    }

    public String processPayment() {
        double paymentDetail = dbOperations.getPaymentDetail();

        if (paymentDetail < 0) {
            return "Payment can not be processed!";
        } else if (paymentDetail > 0 && paymentDetail < 9) {
            return "Not enough!";
        }

        double paymentFee = paymentDetail * 0.10;
        String message = "Payment " + (paymentDetail-paymentFee) + " processed!";
        dbOperations.saveNotificationMessage(message);
        
        if (thirdPartyService.isCustomerGuest()) {
            dbOperations.saveGuestReport();
        }

        return "Payment succeed";
    }

}

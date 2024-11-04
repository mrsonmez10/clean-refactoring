package com.cleanref.chapter03.c13;

import java.math.BigDecimal;

public class PaymentService {

    public String setPayment(BigDecimal amount) {

        if (amount.compareTo(BigDecimal.ONE) < 0) {
            return ErrorCode.PAYMENT_FAILED.getDescription();
        }

        return "";
    }

}

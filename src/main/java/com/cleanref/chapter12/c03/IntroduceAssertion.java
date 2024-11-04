package com.cleanref.chapter12.c03;

public class IntroduceAssertion {

    public static String getExpenseLimit(String limit, String primaryLimit) {
        // limit and primary limit cannot be null
        String result = "result";
        return limit == "limitValue" ? result : primaryLimit;
    }

    public static String getExpenseLimitv2(String limit, String primaryLimit) {
        assert (limit == null || primaryLimit == null);
        String result = "result";
        return limit == "limitValue" ? result : primaryLimit;
    }

    // checked and unchecked exception
    public static String getExpenseLimitv3(String limit, String primaryLimit) {
        if (limit == null || primaryLimit == null) {
            throw new RuntimeException("limit or primary limit is null");
        }
        String result = "result";
        return limit == "limitValue" ? result : primaryLimit;
    }

    public static void main(String[] args) {

    }
}

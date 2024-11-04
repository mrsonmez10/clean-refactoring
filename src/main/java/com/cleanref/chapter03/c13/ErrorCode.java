package com.cleanref.chapter03.c13;

// DEPENDENCY MAGNET
public enum ErrorCode {

    // General Errors
    SERVICE_ERROR(101, "A general service error has occurred"),
    UNKNOWN_ERROR(102, "An unknown error has occurred"),
    VALIDATION_ERROR(103, "Input validation failed"),
    AUTHENTICATION_FAILED(104, "Authentication failed"),
    AUTHORIZATION_FAILED(105, "Authorization failed"),

    // Database Errors
    DATABASE_CONNECTION_ERROR(201, "Failed to connect to the database"),
    DATA_NOT_FOUND(202, "Data not found"),
    DUPLICATE_ENTRY(203, "Duplicate entry found"),
    DATA_SAVE_FAILED(204, "Failed to save data"),

    // Network Errors
    NETWORK_TIMEOUT(301, "Network request timed out"),
    NETWORK_UNAVAILABLE(302, "Network unavailable"),

    // Payment Errors
    PAYMENT_FAILED(401, "Payment processing failed"),
    INSUFFICIENT_FUNDS(402, "Insufficient funds"),
    INVALID_PAYMENT_DETAILS(403, "Invalid payment details"),
    PAYMENT_TIMEOUT(404, "Payment request timed out");

    private final int code;
    private final String description;

    ErrorCode(int code, String description) {
        this.code = code;
        this.description = description;
    }

    public int getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return code + ": " + description;
    }
}

package com.cleanref.chapter10.c01.refactored;

public class PasswordEncryptor {
    public String encrypt(String password) {
        return "ENCRYPTED_" + password;
    }
}

package com.cleanref.chapter08.c04;

public class WrongPasswordException extends RuntimeException {

    private final String password;
    private final String tckn;

    public WrongPasswordException(String password, String tckn) {
        super(String.format("Password: %d, Tckn: %d", password, tckn));

        this.password = password;
        this.tckn = tckn;
    }

}

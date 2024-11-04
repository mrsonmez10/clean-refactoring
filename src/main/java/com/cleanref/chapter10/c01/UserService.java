package com.cleanref.chapter10.c01;

import java.util.HashMap;
import java.util.Map;

public class UserService {

    // inceleyelim..

    private Map<String, String> userDatabase = new HashMap<>();

    public void registerUser(String username, String password) {
        String encryptedPassword = encryptPassword(password);
        userDatabase.put(username, encryptedPassword);
        System.out.println("User registered successfully.");
    }

    public boolean loginUser(String username, String password) {
        String encryptedPassword = userDatabase.get(username);
        return encryptedPassword != null && encryptedPassword.equals(encryptPassword(password));
    }

    private String encryptPassword(String password) {
        return "ENCRYPTED_" + password;
    }
}


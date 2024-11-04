package com.cleanref.chapter10.c01.refactored;

import java.util.HashMap;
import java.util.Map;

public class UserRepository {
    private Map<String, String> userDatabase = new HashMap<>();

    public void saveUser(String username, String password) {
        userDatabase.put(username, password);
    }

    public String getPassword(String username) {
        return userDatabase.get(username);
    }
}

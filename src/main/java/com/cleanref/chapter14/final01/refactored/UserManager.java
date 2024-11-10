package com.cleanref.chapter14.final01.refactored;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class UserManager {

    private final List<User> users;

    public UserManager(List<User> users) {
        this.users = users;
    }

    public void processUsers() {
        users.stream()
                .filter(UserEligibilityChecker::isEligibleForNotification)
                .forEach(NotificationService::sendUserNotification);
    }
}
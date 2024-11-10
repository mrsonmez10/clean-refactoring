package com.cleanref.chapter14.final01.refactored;

class UserEligibilityChecker {

    public static boolean isEligibleForNotification(User user) {
        return user.isPremium() && (user.isActive() || user.isInactive()) && user.hasValidEmail();
    }
}
package com.cleanref.chapter14.final01.refactored;

class User {
    private final String name;
    private final String email;
    private final UserStatus status;
    private final UserGroup group;

    public User(String name, String email, UserStatus status, UserGroup group) {
        this.name = name;
        this.email = email;
        this.status = status;
        this.group = group;
    }

    public String getName() { return name; }
    public String getEmail() { return email; }
    public boolean isActive() { return status == UserStatus.ACTIVE; }
    public boolean isInactive() { return status == UserStatus.INACTIVE; }
    public boolean isPremium() { return group == UserGroup.PREMIUM; }
    public boolean hasValidEmail() { return email != null && email.contains("@"); }
}
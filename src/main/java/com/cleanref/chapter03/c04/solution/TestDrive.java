package com.cleanref.chapter03.c04.solution;

public class TestDrive {
    public static void main(String[] args) {
        NotificationFactory smsFactory = new SMSNotificationFactory();
        Notification sms = smsFactory.createNotification();
        sms.send("Hello via SMS!");
    }
}

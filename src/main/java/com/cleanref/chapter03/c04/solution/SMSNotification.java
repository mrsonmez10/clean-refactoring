package com.cleanref.chapter03.c04.solution;

class SMSNotification implements Notification {
    @Override
    public void send(String message) {
        System.out.println("Sending SMS: " + message);
    }

}
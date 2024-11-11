package com.cleanref.chapter03.c04;

class NotificationService {

    public void sendNotification(String type, String message) {
        if (type.equals("SMS")) {
            // SMS gönderme işlemi
            System.out.println("Sending SMS: " + message);
        } else if (type.equals("Email")) {
            // Email gönderme işlemi
            System.out.println("Sending Email: " + message);
        } else {
            System.out.println("Unknown notification type");
        }
    }

    public static void main(String[] args) {
        NotificationService service = new NotificationService();
        service.sendNotification("SMS", "Hello via SMS!");
        service.sendNotification("Email", "Hello via Email!");
    }

}

package com.cleanref.chapter14.final01.refactored;

class NotificationService {

    public static void sendUserNotification(User user) {
        EmailMessage emailMessage = createEmailMessage(user);
        sendEmail(user.getEmail(), emailMessage);
    }

    private static EmailMessage createEmailMessage(User user) {
        return user.isActive()
                ? new EmailMessage("Welcome!", "Hello " + user.getName() + ", Welcome!")
                : new EmailMessage("Account Inactive", "Hello " + user.getName() + ", Your account is inactive. Please activate it.");
    }

    private static void sendEmail(String email, EmailMessage emailMessage) {
        // Dummy email sending operation
        System.out.printf("Sending email to: %s, with subject: %s, message: %s%n", email, emailMessage.subject(), emailMessage.body());
    }
}

package com.cleanref.chapter14;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class UserManager {

    private List<Map<String, String>> users = new ArrayList<>();

    public UserManager(List<Map<String, String>> users) {
        this.users = users;
    }

    public void processUsers() {
        for (Map<String, String> user : users) {
            if (user.containsKey("status") && user.containsKey("grp") && user.containsKey("email") && user.containsKey("name")) {
                String status = user.get("status");
                String group = user.get("grp");
                String email = user.get("email");
                String name = user.get("name");

                if ((status.equals("active") || status.equals("inactive")) && group.equals("premium") && email.contains("@")) {
                    if (status.equals("active")) {
                        sendEmail(email, "Hello " + name + ", Welcome!");
                    } else if (status.equals("inactive")) {
                        sendEmail(email, "Hello " + name + ", Your account is inactive. Please activate it.");
                    } else {
                        System.out.println("Invalid status for user " + name);
                    }
                }
            }
        }
    }

    public void sendEmail(String email, String message) {
        // Dummy email send operation
        System.out.println("Sending email to: " + email + ", with message: " + message);
    }
}

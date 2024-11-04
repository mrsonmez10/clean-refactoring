package com.cleanref.chapter04.c07.chatgptfails;

public class UserController {
    UserService userService = new UserService();

    public String getUser() {
        return userService.getUserInformations();
    }
}

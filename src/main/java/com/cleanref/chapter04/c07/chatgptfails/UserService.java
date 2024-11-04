package com.cleanref.chapter04.c07.chatgptfails;

public class UserService {
    UserRepository userRepository = new UserRepository();

    public String getUserInformations() {
        return userRepository.getUser();
    }
}

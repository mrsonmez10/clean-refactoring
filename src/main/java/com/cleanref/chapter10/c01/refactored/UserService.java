package com.cleanref.chapter10.c01.refactored;

public class UserService {
    private UserRepository userRepository;
    private PasswordEncryptor passwordEncryptor;

    public UserService(UserRepository userRepository, PasswordEncryptor passwordEncryptor) {
        this.userRepository = userRepository;
        this.passwordEncryptor = passwordEncryptor;
    }

    public void registerUser(String username, String password) {
        String encryptedPassword = passwordEncryptor.encrypt(password);
        userRepository.saveUser(username, encryptedPassword);
        System.out.println("User registered successfully.");
    }

    public boolean loginUser(String username, String password) {
        String encryptedPassword = userRepository.getPassword(username);
        return encryptedPassword != null && encryptedPassword.equals(passwordEncryptor.encrypt(password));
    }
}

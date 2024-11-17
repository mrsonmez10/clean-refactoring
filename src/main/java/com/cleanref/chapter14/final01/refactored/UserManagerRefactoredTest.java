package com.cleanref.chapter14.final01.refactored;

import java.util.ArrayList;
import java.util.List;

public class UserManagerRefactoredTest {
	public static void main(String[] args) {
		// Kullanıcıları tanımla
		List<User> users = new ArrayList<>();
		users.add(new User("Alice", "alice@example.com", UserStatus.ACTIVE, UserGroup.PREMIUM));
		users.add(new User("Bob", "bob@example.com", UserStatus.INACTIVE, UserGroup.PREMIUM));
		users.add(new User("Charlie", "charlie@example.com", UserStatus.BANNED, UserGroup.PREMIUM));
		users.add(new User("David", "david", UserStatus.ACTIVE, UserGroup.PREMIUM)); // Geçersiz email
		users.add(new User("Eve", "eve@example.com", UserStatus.ACTIVE, UserGroup.STANDARD)); // Premium değil

		UserManager userManager = new UserManager(users);
		System.out.println("Processing users in refactored version...");
		userManager.processUsers();
	}
}
package com.cleanref.chapter14;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserManagerLegacyTest {

	public static void main(String[] args) {
		// Kullanıcıları tanımla
		List<Map<String, String>> users = new ArrayList<>();
		users.add(createUser("Alice", "alice@example.com", "active", "premium"));
		users.add(createUser("Bob", "bob@example.com", "inactive", "premium"));
		users.add(createUser("Charlie", "charlie@example.com", "banned", "premium"));
		users.add(createUser("David", "david", "active", "premium")); // Geçersiz email
		users.add(createUser("Eve", "eve@example.com", "active", "standard")); // Premium değil

		// UserManager örneğini oluştur ve processUsers çağrısı yap
		UserManager userManager = new UserManager(users);
		System.out.println("Processing users in legacy version...");
		userManager.processUsers();
	}

	private static Map<String, String> createUser(String name, String email, String status, String group) {
		Map<String, String> user = new HashMap<>();
		user.put("name", name);
		user.put("email", email);
		user.put("status", status);
		user.put("grp", group);
		return user;
	}
}
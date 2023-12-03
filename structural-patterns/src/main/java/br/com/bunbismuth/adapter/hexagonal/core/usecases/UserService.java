package br.com.bunbismuth.adapter.hexagonal.core.usecases;

import br.com.bunbismuth.adapter.hexagonal.core.model.User;
import java.util.List;

import br.com.bunbismuth.adapter.hexagonal.core.ports.UserRepository;

public class UserService {
	private final UserRepository userRepository;

	public UserService(UserRepository userRepo) {
		this.userRepository = userRepo;
	}

	public void saveUser(User user) {
		boolean alreadyUsedEmail = userRepository.getAll().stream()
			.anyMatch(userDb -> userDb.email().equalsIgnoreCase(user.email()));
		if(alreadyUsedEmail) throw new RuntimeException("Email address already exists!");
		userRepository.save(user);
	}
	
	public List<User> getUsers() {
		return userRepository.getAll();
	}
	
}

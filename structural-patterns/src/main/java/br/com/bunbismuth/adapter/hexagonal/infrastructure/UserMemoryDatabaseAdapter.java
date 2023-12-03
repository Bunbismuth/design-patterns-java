package br.com.bunbismuth.adapter.hexagonal.infrastructure;

import br.com.bunbismuth.adapter.hexagonal.core.model.User;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import br.com.bunbismuth.adapter.hexagonal.core.ports.UserRepository;

public class UserMemoryDatabaseAdapter implements UserRepository {
	
	private final Map<String, User> memoryUsers = new HashMap<>();

	@Override
	public void save(User user) {
		memoryUsers.put(user.email(), user);
	}

	@Override
	public List<User> getAll() {
		return new ArrayList<>(memoryUsers.values());
	}

}

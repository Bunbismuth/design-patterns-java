package br.com.bunbismuth.adapter.hexagonal.application;

import br.com.bunbismuth.adapter.hexagonal.core.model.User;
import java.util.List;
import java.util.Map;

import br.com.bunbismuth.adapter.hexagonal.core.ports.UserRepository;
import br.com.bunbismuth.adapter.hexagonal.core.usecases.UserService;
import br.com.bunbismuth.adapter.hexagonal.infrastructure.UserMemoryDatabaseAdapter;

public class UserRest {
	private final UserService userFacade;
	
	public UserRest() {
		UserRepository userRepository = new UserMemoryDatabaseAdapter();
		userFacade = new UserService(userRepository);
	}

	public Integer post(Map<String, String> values) {
		try { 
			User user = new User(values.get("name"), values.get("email"), values.get("password"));
			userFacade.saveUser(user);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return 400;
		}
		return 201;
	}
	
	public Integer get() {
		List<User> users = userFacade.getUsers();
		users.forEach(System.out::println);
		return 200;
	}
}

package nLayeredOdev.business.abstracts;

import java.util.List;

import nLayeredOdev.entities.concretes.User;

public interface UserService {
	void add(User user);
	void delete(User user);
	void update(User user);
	void verifyUser(int id);
	User get(int id);
	
	List<User> getAll();

}

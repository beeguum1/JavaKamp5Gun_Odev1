package nLayeredOdev.business.abstracts;

import nLayeredOdev.entities.concretes.User;

public interface UserValidationService {
	void logIn(User user ,String email, String password);

}

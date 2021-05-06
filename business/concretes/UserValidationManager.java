package nLayeredOdev.business.concretes;

import nLayeredOdev.business.abstracts.UserValidationService;
import nLayeredOdev.entities.concretes.User;

public class UserValidationManager implements UserValidationService {

	@Override
	public void logIn(User user, String email, String password) {
		if (email != user.getEmail()) {
			System.out.println("Giris basarisiz! Emailinizin doðru olduðuna emin misiniz?");
			
		}else {
			 if ((password != user.getPassword())) {
				System.out.println("Parola yanlis! Tekrar deneyin.");
			}
			
			else {
				System.out.println("Giris basarili! Hosgeldin " + user.getFirstName()+" "+ user.getLastName()+".");
			}
		}
		
	}


}

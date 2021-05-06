package nLayeredOdev;

import nLayeredOdev.business.abstracts.UserService;
import nLayeredOdev.business.abstracts.UserValidationService;
import nLayeredOdev.business.concretes.UserManager;
import nLayeredOdev.business.concretes.UserValidationManager;
import nLayeredOdev.entities.concretes.User;
import nLayeredOdev.core.GoogleManagerAdapter;
import nLayeredOdev.core.GoogleService;
import nLayeredOdev.core.ValidateManager;

public class Main {

	public static void main(String[] args) {
		
		
		UserService userService = new UserManager(new ValidateManager());
		User user1 = new User(1,"Beg�m","G�ven","begumguven@gmail.com","parola123");//DOGRU G�R�S
		User user2 = new User(2,"Ceyda","�zcan","ceydaozcan@gmail.com","123");//EKSIK PAROLA
		User user3=  new User(3,"�a�da�","K","cagdaskus@gmail.com","parola456");//EKSIK SOYAD
		User user4=  new User(4,"B��ra","G�ven","begumguven@gmail.com","parola789");//TEKRAR EDEN EMAIL
		User user5= new User(5,"Mert", "Hepy�kselen", "merthepyukselen.com","parola000");//EMAIL FORMU YANLIS
		
		userService.add(user1);
		userService.add(user2);
		userService.add(user3);
		userService.add(user4);
		userService.add(user5);
		System.out.println("*************************************************************");
		
		UserValidationService userValidationService = new UserValidationManager();
		userValidationService.logIn(user1,"begumguven@gmail.com", "parola123");//DOGRU G�R�S
		userValidationService.logIn(user2,"ceydaozcannnn@gmail.com", "parola456");//YANLIS EMAIL
		userValidationService.logIn(user3,"cagdaskus@gmail.com", "parola123");//YANLIS PAROLA
		
		System.out.println("*************************************************************");
		
		GoogleService googleService = new GoogleManagerAdapter();
		googleService.login("begum_google@gmail.com", "123456");
	}

}

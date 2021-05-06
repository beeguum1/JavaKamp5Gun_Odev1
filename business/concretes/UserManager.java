package nLayeredOdev.business.concretes;

import java.util.ArrayList;
import java.util.List;

import nLayeredOdev.business.abstracts.UserService;
import nLayeredOdev.core.ValidateService;
import nLayeredOdev.dataAccess.abstracts.UserDao;
import nLayeredOdev.entities.concretes.User;

public class UserManager implements UserService{
	
	private List<String> emailList = new ArrayList<String>();
	private ValidateService validateService;
	
	public UserManager(ValidateService validateService) {
		
		this.validateService = validateService;
	}
	
	private UserDao userDao;

	public UserManager(UserDao userDao) {
		super();
		this.userDao = userDao;
	}

	@Override
	public void add(User user) {
		if (emailList.contains(user.getEmail()) ) {
			System.out.println("Kullanıcı eklenemedi. Bu email adresi baskasi tarafindan kullaniliyor "+ user.getFirstName()+" "+ user.getLastName()+" !");
			return;
		}
		
		if (user.getPassword().length() <= 6) {
			System.out.println("Kullanıcı eklenemedi. Parola en az 6 karakterden olusmali " + user.getFirstName()+" "+ user.getLastName()+" !");
			return ;
		}
		
		
		if (user.getFirstName().length()<=2 || user.getLastName().length()<=2)  {
			System.out.println("Kullanıcı eklenemedi. Ad ve soyad en az iki karakterden olusmalidir!");
			return ;
		}
		if (validateService.validate(user.getEmail()) == false) {
			System.out.println("Email formatinizda bir yanlislik var gibi duruyor. Lütfen kontrol edin "+user.getFirstName()+" "+ user.getLastName()+" !");
			return;
		}else {
			emailList.add(user.getEmail());
		}
		
		System.out.println("Kullanici eklendi : "+user.getFirstName()+" "+ user.getLastName());
		System.out.println("<Sent to: "+user.getEmail()+"> Uyelik isteginiz başarıyla bize ulasti. Siz oldugunuzdan emin olmak icin asagidaki linke basmaniz yeterli!"
				+ "\n"+ "www.dogrulamaLinki.com");
		System.out.println("*************************************************************");
		
		
		
	}

	@Override
	public void delete(User user) {
		//userDao.delete(user);
		
	}

	@Override
	public void update(User user) {
		//userDao.update(user);
		
	}

	@Override
	public void verifyUser(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public User get(int id) {
		// TODO Auto-generated method stub
		return userDao.get(id);
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return userDao.getAll();
	}
	

}

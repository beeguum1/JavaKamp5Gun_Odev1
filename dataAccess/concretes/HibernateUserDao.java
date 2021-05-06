package nLayeredOdev.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import nLayeredOdev.dataAccess.abstracts.UserDao;
import nLayeredOdev.entities.concretes.User;

public class HibernateUserDao implements UserDao{
	
	//List <String> list = new  ArrayList <String> ();
	List <User> users= new ArrayList <User>();

	@Override
	public void add(User user) {
		users.add(user);
		System.out.println("Kullanýcý eklendi: "+ user.getFirstName()+" "+ user.getLastName());
		
	}

	@Override
	public void delete(User user) {
		System.out.println("Kullanýcý silindi: "+ user.getFirstName()+" "+ user.getLastName());
		
		
	}

	@Override
	public void update(User user) {
		System.out.println("Kullanýcý güncellendi: "+ user.getFirstName()+" "+ user.getLastName());
		
		
	}

	@Override
	public List<User> getAll() {
	
		return null;
	}

	@Override
	public User get(int id) {
		
		return null;
	}

}

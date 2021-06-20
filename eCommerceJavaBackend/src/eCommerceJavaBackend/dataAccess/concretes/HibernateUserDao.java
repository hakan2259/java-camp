package eCommerceJavaBackend.dataAccess.concretes;


import java.util.ArrayList;
import java.util.List;

import eCommerceJavaBackend.dataAccess.abstracts.UserDao;
import eCommerceJavaBackend.entities.concretes.User;

public class HibernateUserDao implements UserDao {
	
	ArrayList<User> users = new ArrayList<User>();


	@Override
	public void register(User user) {
		System.out.println(user.getFirstName() + " isimli kullanýcý hibernate ile kaydolmustur");
		users.add(user);
	}

	@Override
	public void login(User user) {
		System.out.println(user.getFirstName() + " isimli kullanýcý hibernate ile giris yaptý");

		
	}

	@Override
	public List<User> getAll() {
		return users;
	}

	@Override
	public void verified(User user) {
		user.setVerify(true);
		
		
	}

}

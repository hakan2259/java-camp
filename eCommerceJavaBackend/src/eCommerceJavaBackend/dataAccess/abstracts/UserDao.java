package eCommerceJavaBackend.dataAccess.abstracts;

import java.util.List;

import eCommerceJavaBackend.entities.concretes.User;

public interface UserDao {
	
	void register(User user);
	void login(User user);
	void verified(User user);
	
	List<User> getAll();
	
	

}

package eCommerceJavaBackend.business.abstracts;

import eCommerceJavaBackend.entities.concretes.User;

public interface UserService {
	
	void register(User user);
	void login(User user);
	void sendMail(User user);
	void onClickVerified(User user);
	

}

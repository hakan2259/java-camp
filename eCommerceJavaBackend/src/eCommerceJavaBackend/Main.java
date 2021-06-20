package eCommerceJavaBackend;

import eCommerceJavaBackend.business.abstracts.UserService;
import eCommerceJavaBackend.business.concretes.UserManager;
import eCommerceJavaBackend.core.JGoogleAuthenticationManagerAdapter;
import eCommerceJavaBackend.dataAccess.concretes.HibernateUserDao;
import eCommerceJavaBackend.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		User user1=new User();
		user1.setId(1);
		user1.setFirstName("Hakan");
		user1.setLastName("Sandal");
		user1.setEmail("hakan.sandal@gmail.com");
		user1.setPassword("213123213");
		user1.setVerify(false);
		
		
		User user2=new User();
		user2.setId(1);
		user2.setFirstName("Betül");
		user2.setLastName("Yeþildað");
		user2.setEmail("betul.yesildag@gmail.com");
		user2.setPassword("111");
		user2.setVerify(false);
		
	
		
	
		
		UserService userService = new UserManager(new HibernateUserDao(),new JGoogleAuthenticationManagerAdapter());
		userService.register(user1);
		userService.sendMail(user1);
		userService.onClickVerified(user1);
		userService.login(user1);
		
		
		
		

	}

}

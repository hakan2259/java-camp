package eCommerceJavaBackend.jGoogleAuthentication;

import eCommerceJavaBackend.entities.concretes.User;

public class JGoogleAuthenticationManager {
	
	public void register(User user) {
		
		System.out.println(user.getFirstName() + " " + user.getLastName() + " isimli kullan�c� google authentication ile kay�t oldu.");
		
	}

}

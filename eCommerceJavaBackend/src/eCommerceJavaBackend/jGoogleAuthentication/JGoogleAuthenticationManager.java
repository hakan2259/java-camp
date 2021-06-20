package eCommerceJavaBackend.jGoogleAuthentication;

import eCommerceJavaBackend.entities.concretes.User;

public class JGoogleAuthenticationManager {
	
	public void register(User user) {
		
		System.out.println(user.getFirstName() + " " + user.getLastName() + " isimli kullanýcý google authentication ile kayýt oldu.");
		
	}

}

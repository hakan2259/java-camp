package eCommerceJavaBackend.core;

import eCommerceJavaBackend.entities.concretes.User;
import eCommerceJavaBackend.jGoogleAuthentication.JGoogleAuthenticationManager;

public class JGoogleAuthenticationManagerAdapter implements GoogleAuthenticationService {

	@Override
	public void register(User user) {
		JGoogleAuthenticationManager jGoogleAuthenticationManager = new JGoogleAuthenticationManager();
		jGoogleAuthenticationManager.register(user);
	}

}

package eCommerceJavaBackend.business.concretes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import eCommerceJavaBackend.business.abstracts.UserService;
import eCommerceJavaBackend.core.GoogleAuthenticationService;
import eCommerceJavaBackend.dataAccess.abstracts.UserDao;
import eCommerceJavaBackend.entities.concretes.User;

public class UserManager implements UserService {
	
	private UserDao userDao;
	private GoogleAuthenticationService googleAuthenticationService;
	
	
	

	public UserManager(UserDao userDao,GoogleAuthenticationService googleAuthenticationService) {
		super();
		this.userDao = userDao;
		this.googleAuthenticationService = googleAuthenticationService;
	}

	@Override
	public void register(User user) {
		
		
		if(user.getPassword().length()<6) {
			System.out.println("password en az 6 karakterden olusmal�d�r!");
			return;
		}
		final String EMAIL_PATTERN = "^(.+)@(\\S+)$";
	    final Pattern pattern = Pattern.compile(EMAIL_PATTERN);
	    Matcher matcher = pattern.matcher(user.getEmail());
	    

		if(!matcher.matches()) {
			System.out.println(user.getEmail() + " e-posta format�na uygun de�ildir!");
			return;
		}
		if(user.getFirstName().length()<2 && user.getLastName().length()<2){
			System.out.println("Ad ve soyad en az 2 karakterden olusmal�d�r!");
			return;
		}
		for (User users: userDao.getAll()) {
			if(users.getEmail().equals(user.getEmail())) {
				System.out.println(user.getEmail() + "bu e-posta adresi sistemde mevcuttur! L�tfen ba�ka bir e-posta adresi deneyiniz.");
				return;
			}
		}
		
		this.userDao.register(user);
		this.googleAuthenticationService.register(user);
		
		
		
		
		
		
		
	}

	@Override
	public void login(User user) {
		if(user.isVerify()==true) {
			userDao.login(user);
		}else {
			System.out.println("Giri� Ba�ar�s�z!");
		}
		
	}

	@Override
	public void sendMail(User user) {
		System.out.println(user.getEmail() + " adresine mail gonderildi!");
		
	}

	@Override
	public void onClickVerified(User user) {
		
			userDao.verified(user);
			if(user.isVerify()==true) {
				System.out.println(user.getEmail() + "e-posta adresi dogrulanm�st�r.");

			}else {
				System.out.println("Hatal�");
			}
		
		
		
		
		
	}
	
	

}

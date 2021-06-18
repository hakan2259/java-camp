
public class StudentManager extends UserManager {
	
	@Override
	public void add(User user) {
		System.out.println(user.getEmail() + " sisteme ogrenci eklendi");
	}
	
	public void delete(User user) {
		System.out.println(user.getEmail() + " ogrenci silindi");
	}

}

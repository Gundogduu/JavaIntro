package day3Task;

public class UserManager {

	public void add(User user) {
		System.out.println("Kullanıcı eklendi: " + user.firstName );
	}
	
	public void delete(int id) {
		System.out.println("Kullanıcı silindi");
	}
	
	public void update(User user) {
		System.out.println("Kullanıcı güncellendi: " + user.firstName );
	}
}

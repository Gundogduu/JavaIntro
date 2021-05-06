package day3Task;

public class UserManager {

	public void add(User user) {
		System.out.println("Kullanýcý eklendi: " + user.firstName );
	}
	
	public void delete(int id) {
		System.out.println("Kullanýcý silindi");
	}
	
	public void update(User user) {
		System.out.println("Kullanýcý güncellendi: " + user.firstName );
	}
}

package day3Task;

public class UserManager {

	public void add(User user) {
		System.out.println("Kullan�c� eklendi: " + user.firstName );
	}
	
	public void delete(int id) {
		System.out.println("Kullan�c� silindi");
	}
	
	public void update(User user) {
		System.out.println("Kullan�c� g�ncellendi: " + user.firstName );
	}
}

package day3Task;

public class UserManager {
	
	User user3 = new Instructor(1, "Hasan", "Sencer", "sencer11@gmail.com", "333222");	
	
	public void add(User user) {
		System.out.println("Kullan�c� eklendi: " + user.getFirstName() );
	}
	
	public void delete(int id) {		
		if(this.user3.getId() == id) {
			System.out.println("Kullan�c� silindi: " + user3.getFirstName());
		}		
	}
	
	public void update(User user) {
		System.out.println("Kullan�c� g�ncellendi: " + user.getFirstName() );
	}
}
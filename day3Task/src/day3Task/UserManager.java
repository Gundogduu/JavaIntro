package day3Task;

public class UserManager {
	
	User user = new User(1,"Mazlum","R�fk�","mazlum@gmail.com","147258");	
	
	public void add(User user) {
		System.out.println("Kullan�c� eklendi: " + user.getFirstName() );
	}
	
	public void delete(int id) {		
		if(this.user.getId() == id) {
			System.out.println("Kullan�c� silindi: " + user.firstName);
		}		
	}
	
	public void update(User user) {
		System.out.println("Kullan�c� g�ncellendi: " + user.getFirstName() );
	}
}
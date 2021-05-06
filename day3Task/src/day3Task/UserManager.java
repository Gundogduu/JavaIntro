package day3Task;

public class UserManager {
	
	User user = new User(1,"Mazlum","Rýfký","mazlum@gmail.com","147258");	
	
	public void add(User user) {
		System.out.println("Kullanýcý eklendi: " + user.getFirstName() );
	}
	
	public void delete(int id) {		
		if(this.user.getId() == id) {
			System.out.println("Kullanýcý silindi: " + user.firstName);
		}		
	}
	
	public void update(User user) {
		System.out.println("Kullanýcý güncellendi: " + user.getFirstName() );
	}
}
package day3Task;

public class Main {

	public static void main(String[] args) {
		
		
		UserManager manager = new UserManager();
		manager.add(new Student(1, "Ahmet", "Gündüz", "gunduz34@gmail.com", "12345", "12365498711"));
		manager.add(new Instructor(1, "Hasan", "Sencer", "sencer11@gmail.com", "333222"));
		manager.delete(1);
		manager.update(new Student(1,"Ahmet","Gündüz","ahmet@gmail.com","456123","12365498711"));
	}

}

package day3Task;

public class Main {

	public static void main(String[] args) {
		
		
		UserManager manager = new UserManager();
		manager.add(new Student(1, "Ahmet", "Gündüz", "gunduz34@gmail.com", "12345", "12365498711"));
		manager.add(new Instructor(1, "Hasan", "Sencer", "sencer11@gmail.com", "333222"));
		manager.login();
		manager.sendComment();
		UserManager manager2 = new InstructorManager();
	}

}

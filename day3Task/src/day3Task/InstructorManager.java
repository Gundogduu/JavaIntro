package day3Task;

public class InstructorManager extends UserManager{
	Instructor ınstructor1 = new Instructor(1, "Hasan", "Sencer", "sencer11@gmail.com", "333222");
	
	public void add(Instructor instructor) {
		System.out.println("Kullanıcı eklendi: " + instructor.getFirstName() );
	}
	
	@Override
	public void delete(int id) {		
		if(this.ınstructor1.getId() == id) {
			System.out.println("Kullanıcı silindi: " + ınstructor1.getFirstName());
		}		
	}
	
	public void update(Instructor instructor) {
		System.out.println("Kullanıcı güncellendi: " + instructor.getFirstName() );
	}
}

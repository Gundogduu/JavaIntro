package day3Task;

public class InstructorManager extends UserManager{
	Instructor �nstructor1 = new Instructor(1, "Hasan", "Sencer", "sencer11@gmail.com", "333222");
	
	public void add(Instructor instructor) {
		System.out.println("Kullan�c� eklendi: " + instructor.getFirstName() );
	}
	
	@Override
	public void delete(int id) {		
		if(this.�nstructor1.getId() == id) {
			System.out.println("Kullan�c� silindi: " + �nstructor1.getFirstName());
		}		
	}
	
	public void update(Instructor instructor) {
		System.out.println("Kullan�c� g�ncellendi: " + instructor.getFirstName() );
	}
}

package day3Task;

public class InstructorManager extends UserManager{
	Instructor ýnstructor1 = new Instructor(1, "Hasan", "Sencer", "sencer11@gmail.com", "333222");
	
	public void add(Instructor instructor) {
		System.out.println("Kullanýcý eklendi: " + instructor.getFirstName() );
	}
	
	@Override
	public void delete(int id) {		
		if(this.ýnstructor1.getId() == id) {
			System.out.println("Kullanýcý silindi: " + ýnstructor1.getFirstName());
		}		
	}
	
	public void update(Instructor instructor) {
		System.out.println("Kullanýcý güncellendi: " + instructor.getFirstName() );
	}
}

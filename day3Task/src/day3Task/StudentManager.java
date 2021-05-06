package day3Task;

public class StudentManager extends UserManager{
	
	Student student1 = new Student(1,"Mazlum","Rıfkı","mazlum@gmail.com","147258","456789787895");	
	
	public void add(Student student) {
		System.out.println("Kullanıcı eklendi: " + student.getStudentNumber() + " no'lu " + student.getFirstName() + " " + student.getLastName());
	}
	
	@Override
	public void delete(int id) {		
		if(this.student1.getId() == id) {
			System.out.println("Kullanıcı silindi: " + student1.getStudentNumber() + " no'lu " + student1.getFirstName() + " " + student1.getLastName());
		}		
	}
	
	public void update(Student student) {
		System.out.println("Kullanıcı güncellendi: " + student.getStudentNumber() + " no'lu " + student.getFirstName() + " " + student.getLastName());
	}
}

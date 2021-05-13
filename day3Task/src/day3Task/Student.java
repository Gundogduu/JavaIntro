package day3Task;

public class Student extends User{
	
	String studentNumber;
	
	public Student(int id, String firstName, String lastName, String email, String password, String studentNumber) {
		super(id, firstName, lastName, email, password);
		this.studentNumber = studentNumber;
		// TODO Auto-generated constructor stub
	}
	
	public void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	}

	public String getStudentNumber() {
		return studentNumber;
	}
}

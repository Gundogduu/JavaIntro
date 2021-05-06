package day3Task;

public class Student extends User{

	String nationalIdentity;
	
	
	public Student(int id, String firstName, String lastName, String email, String password, String nationalIdentity) {
		super(id, firstName, lastName, email, password);
		this.nationalIdentity = nationalIdentity;
	}
	
	

	public String getNationalIdentity() {
		return nationalIdentity;
	}

	public void setNationalIdentity(String nationalIdentity) {
		this.nationalIdentity = nationalIdentity;
	}

}

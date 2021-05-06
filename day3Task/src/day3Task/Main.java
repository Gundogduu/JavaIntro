package day3Task;

public class Main {

	public static void main(String[] args) {	
		
		InstructorManager manager = new InstructorManager();
		System.out.println("---------Instructor--------");
		
		//ekleme
		manager.add(new Instructor(1,"Engin","Demiro�","demirog06@gmail.com","147258"));
		
		//g�ncelleme
		manager.update(new Instructor(1,"Engin","Demiro�","demirog@gmail.com","456123"));
		
		//silme
		manager.delete(1);
		
		
		StudentManager manager2 = new StudentManager();		
		System.out.println("---------Student--------");
		
		//ekleme
		manager2.add(new Student(1, "Ahmet", "G�nd�z", "gunduz34@gmail.com", "12345", "12365498711"));
		manager2.add(new Student(1, "Mehmet", "G�nd�z", "gunduz25@gmail.com", "12384", "78965498711"));
		
		//g�ncelleme
		manager2.update(new Student(1,"Ahmet","G�nd�z","ahmet@gmail.com","456123","12365498711"));
		
		//silme
		manager2.delete(1);
	}
}

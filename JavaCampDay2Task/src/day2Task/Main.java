/**
 * 
 */
package day2Task;

public class Main {

	public static void main(String[] args) {
		Course course1 = new Course(1, "C# & Angular Kursu", "Engin Demiro�");
		Course course2 = new Course(2, "Java & React Kursu", "Engin Demiro�");

		
		Course[] courses = {course1, course2};
		System.out.println("Kodlama.io");
		System.out.println("Kurslar: ");
		
		
		for (Course course : courses) {
			System.out.println("-----------------------------------");
			System.out.println("Kurs Ad�: " + course.name);
			System.out.println("Kurs E�itmeni: " + course.teacher);
		}
		
		
		CourseManager manager = new CourseManager();
		System.out.println("--------");
		manager.add(course1);
		manager.delete(course2);
		System.out.println("--------");
		manager.nextLessonButton();
		manager.previousLessonButton();
	}

}

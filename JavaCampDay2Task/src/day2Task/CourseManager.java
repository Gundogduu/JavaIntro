package day2Task;

public class CourseManager {
	public void add(Course course) {
		System.out.println("Kurs eklendi: " + course.name);
	}
	
	public void delete(Course course) {
		System.out.println("Kurs silindi: " + course.name);
	}
	
	public void nextLessonButton() {
		System.out.println("bir sonraki derse geçildi");
	}
	
	public void previousLessonButton() {
		System.out.println("bir önceki derse geçildi");
	}
}

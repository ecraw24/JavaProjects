
public class Course {
	private String courseName;
	private String[] students;
	private int numberOfStudents;
	private final int MAX_STUDENTS = 100;
	
	public Course(String name) {
		this.courseName = name;
		this.numberOfStudents = 0;
		this.students = new String[MAX_STUDENTS];
	}
	
	public void addStudent(String student) {
		this.students[this.numberOfStudents] = student;
		this.numberOfStudents++;
	}
	
	public String[] getStudents() {
		return this.students;
	}
	
	public int getNumberOfStudents() {
		return this.numberOfStudents;
	}
}

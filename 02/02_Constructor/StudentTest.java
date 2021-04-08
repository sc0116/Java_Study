package ch06;

public class StudentTest {

	public static void main(String[] args) {

		Student studentLee = new Student();
		
		System.out.println(studentLee.showStudentInfo());
		
		Student studentShin = new Student(888, "Shin", 4);
		
		System.out.println(studentShin.showStudentInfo());
	}

}

package ch24;

public class StudentTest {

	public static void main(String[] args) {

		Student studentLee = new Student(991, "Lee");
		
		studentLee.addSubject("����", 100);
		studentLee.addSubject("����", 100);
		
		Student studentShin = new Student(888, "Shin");
		studentShin.addSubject("����", 100);
		studentShin.addSubject("����", 90);
		studentShin.addSubject("����", 90);
		
		studentLee.showStudentInfo();
		System.out.println("==============================");
		studentShin.showStudentInfo();
	}

}

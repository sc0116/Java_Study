package ch04;

public class StudentTest {

	public static void main(String[] args) {

		Student studentLee = new Student();
		studentLee.studentId = 12345;
		studentLee.setStudentName("Lee");
		studentLee.address = "���� ������";
		
		studentLee.showStudentInfo();
		
		Student studentShin = new Student();
		studentShin.studentId = 54321;
		studentShin.studentName = "Shin";
		studentShin.address = "��⵵ ������";
		
		studentShin.showStudentInfo();
		
		System.out.println(studentLee);
		System.out.println(studentShin); 
	}

}

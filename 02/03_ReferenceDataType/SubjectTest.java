package ch09;

public class SubjectTest {

	public static void main(String[] args) {

		Student studentLee = new Student(100, "Lee");
		studentLee.setKoreaSubject("����", 100);
		studentLee.setMathSubject("����", 100);
		
		Student studentShin = new Student(100, "Shin");
		studentShin.setKoreaSubject("����", 99);
		studentShin.setMathSubject("����", 99);
		
		studentLee.showScoreInfo();
		studentShin.showScoreInfo();
	
	}

}

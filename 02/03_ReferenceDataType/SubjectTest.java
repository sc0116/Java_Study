package ch09;

public class SubjectTest {

	public static void main(String[] args) {

		Student studentLee = new Student(100, "Lee");
		studentLee.setKoreaSubject("국어", 100);
		studentLee.setMathSubject("수학", 100);
		
		Student studentShin = new Student(100, "Shin");
		studentShin.setKoreaSubject("국어", 99);
		studentShin.setMathSubject("수학", 99);
		
		studentLee.showScoreInfo();
		studentShin.showScoreInfo();
	
	}

}

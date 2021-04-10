package ch24;

import java.util.ArrayList;

public class Student {

	private int studentId;
	private String studentName;
	private ArrayList<Subject> subjectList;
	
	public Student(int studentId, String studentName) {
		this.studentId = studentId;
		this.studentName = studentName;
		subjectList = new ArrayList<> ();
	}
	
	public void addSubject(String subjectName, int score) {
		Subject subject = new Subject();
		subject.setSubjectName(subjectName);
		subject.setScore(score);
		subjectList.add(subject);
	}
	
	public void showStudentInfo() {
		int total = 0;
		
		for(int i = 0; i < subjectList.size(); i++) {
			System.out.println(subjectList.get(i).getSubjectName() + " 점수는 " + subjectList.get(i).getScore() + "점 입니다.");
			total += subjectList.get(i).getScore();
		}
		System.out.println(studentName + "학생의 총점은 " + total + "점 입니다.");
		
	}
}

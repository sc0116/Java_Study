package ch02;

public class EqualsTest {

	public static void main(String[] args) throws CloneNotSupportedException {

		Student std1 = new Student(100, "Lee");
		Student std2 = new Student(100, "Lee");
		Student std3 = std1;
		
		System.out.println("�ٸ� �ּ�, ���� �й�, ==\n-> " + (std1 == std2));
		System.out.println("�ٸ� �ּ�, ���� �й�, overriding equals()\n-> " + (std1.equals(std2)));
		
		System.out.println(std1.hashCode());
		System.out.println(std2.hashCode());
		
		System.out.println(System.identityHashCode(std1));
		System.out.println(System.identityHashCode(std2));
		
		Student copy = (Student)std1.clone();
		System.out.println(copy);
	}

}

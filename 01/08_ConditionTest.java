package ch13;

import java.util.Scanner;

public class ConditionTest {

	public static void main(String[] args) {

	int max;
	System.out.println("�� ���� �Է� �޾Ƽ� �� ū ���� ����ϼ���\n");
	
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("�Է�: ");
	int n1 = scanner.nextInt();
	System.out.println("�Է�: ");
	int n2 = scanner.nextInt();
	
	max = (n1 > n2) ? n1 : n2;
	System.out.println("���: \n " + max);
	
	}

}

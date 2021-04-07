package ch13;

import java.util.Scanner;

public class ConditionTest {

	public static void main(String[] args) {

	int max;
	System.out.println("두 수를 입력 받아서 더 큰 수를 출력하세요\n");
	
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("입력: ");
	int n1 = scanner.nextInt();
	System.out.println("입력: ");
	int n2 = scanner.nextInt();
	
	max = (n1 > n2) ? n1 : n2;
	System.out.println("출력: \n " + max);
	
	}

}

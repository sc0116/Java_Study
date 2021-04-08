package ch13;

public class BitOperationTest {

	public static void main(String[] args) {

		int n1 = 5;
		int n2 = 10;
		
		System.out.println(n1 | n2);
		System.out.println(n1 & n2);
		System.out.println(n1 ^ n2);
		System.out.println(~n1);
		
		System.out.println(n1 << 2);
		System.out.println(n1);
		System.out.println(n1 <<= 2);
		System.out.println(n1);
	}

}

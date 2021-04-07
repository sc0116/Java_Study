package ch04;

public class BinaryTest {

	public static void main(String[] args) {

		int num = 10;
		int bNum = 0b1010;
		int oNum = 012;
		int hNum = 0xa;
		
		System.out.println(num);
		System.out.println(bNum);
		System.out.println(oNum);
		System.out.println(hNum + "\n");
		
		System.out.println(Integer.toBinaryString(num));
		System.out.println(Integer.toOctalString(num));
		System.out.println(Integer.toHexString(num));
	}

}

package ch03;

public class StringBuilderTest {

	public static void main(String[] args) {

		String java = new String("java");
		String and = new String("and");
		
		StringBuilder buffer = new StringBuilder(java);
		System.out.println(System.identityHashCode(java));
		buffer.append(and);
		System.out.println(System.identityHashCode(java));
		
		String test = buffer.toString();
		System.out.println(test);
	}

}

package lesson13;

public class Example2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String s = null;
		testMethod2(s);
	}
	
	static void testMethod2(String s) {
		testMethod(s);
	}

	static void testMethod(String s) {
		try {
			testMethod3(s);
		} catch(NullPointerException npe) {
			throw new RuntimeException("Could not retrieve strings length.", npe);
		}
	}

	private static void testMethod3(String s) {
		System.out.println(s.length());
	}
}

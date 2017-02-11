package lesson02;

public class ForBreak {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		for(int i = 0; i < 100000; i++) {
			if (i > 10) {
				break;
			}
			System.out.println(i);
		}
		
		System.out.println("that's it.");

	}

}

package lesson02;

public class ForExample2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int i = 0;
		for (;; ) {
			if (i > 100000) {
				// just to get out of the endless loop
				break;
			}
			i++;
			System.out.println(i + " ");
		}
		
	}

}

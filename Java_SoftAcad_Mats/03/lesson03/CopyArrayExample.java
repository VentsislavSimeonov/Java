package lesson03;

public class CopyArrayExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		double[] array = { 1.5, 2, 8};
		double[] array2 = array;
		
		System.out.println(array2[0] );
		
		array[0] = -10;

		System.out.println(array2[0] );
	}

}

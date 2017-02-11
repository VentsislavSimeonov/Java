package lesson03;

public class CompareArrays {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		double[] array1 = {3.5, 5, 7};
		double[] array2 = new double[3];
		array2[0] = 3.5;
		array2[1] = 5;
		array2[2] = 7;
		
		System.out.println(array1 == array2);
		
//		array2 = array1; 		
//		System.out.println(array1 == array2);
		
		if (array1.length != array2.length) {
			System.out.println("array's size does not match.");
		} else {
			boolean sameArrays = true;
			for (int i = 0; i < array1.length; i++) {
				if (array1[i] != array2[i]) {
					sameArrays = false;
					break;
				}
			}
			
			if (sameArrays) {
				System.out.println("arrays are the same.");
			} else {
				System.out.println("arrays are not the same.");
			}
			
		}

	}

}

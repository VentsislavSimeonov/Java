package lesson04;

public class MyBubbleSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int[] someArray = {3, 5, 1, 12, 7, -3};
		
		for (int i = 0; i < someArray.length; i++) {
			for(int j = 0; j < someArray.length - i - 1; j++) {
				if (someArray[j] > someArray[j+1]) {
					int temp = someArray[j];
					someArray[j] = someArray[j+1];
					someArray[j+1] = temp;
				}
				
				for (int k = 0; k < someArray.length; k++) {
					System.out.print(someArray[k] + " ");
				}
				System.out.println();
				
			}
			System.out.println();
		}

		for (int i = 0; i < someArray.length; i++) {
			System.out.print(someArray[i] + " ");
		}
		
	}

}

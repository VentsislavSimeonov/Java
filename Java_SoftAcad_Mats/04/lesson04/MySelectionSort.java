package lesson04;

public class MySelectionSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int[] someArray = {3, 5, 1, 12, 7, -3};
		
		for(int i = 0; i < someArray.length - 1 ; i++) {
			int minIndex = i;
			
			for(int j = i + 1; j < someArray.length; j++) {
				if (someArray[minIndex] > someArray[j]) {
					minIndex = j;
				}
			}
			
			// swap elements
			int temp = someArray[i];
			someArray[i] = someArray[minIndex];
			someArray[minIndex] = temp;

		}
		
		// print array elements
		for (int k = 0; k < someArray.length; k++) {
			System.out.print(someArray[k] + " ");
		}

	}

}

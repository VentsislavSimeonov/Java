package lesson04;

public class BubbleSortOptimized {
	public static void main(String[] args) {
		//int[] arr = {9, 5, 1, 3, 2, 7};
		int[] arr = {1, 2, 3, 5, 7, 9, 11, 12, 14, 16, 20, 21, 22, 23, 34, 60};
		
		boolean isSorted = false;
		int counter = 0;
		for (int i = 0; i < arr.length - 1 && !isSorted; i++) {
			isSorted = true;
			for (int j = 0; j < arr.length - 1 - i; j++) {
				counter ++;
				if(arr[j] > arr[j + 1]) {
					isSorted = false;
					//swap the element
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		//check results
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("Counter: " + counter);
	}
}

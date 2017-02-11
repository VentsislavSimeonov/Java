package lesson04;

public class SortSelection {
	public static void main(String[] args) {
		int[] arr = {9, 5, 1, 3, 2, 7};
		
		for (int i = 0; i < arr.length; i++) {
			int min = arr[i];
			int index = i;
			for (int j = i + 1; j < arr.length; j++) {
				if(arr[j] < min) {
					min = arr[j];
					index = j;
				}
			}
			//swap the elements
			int temp = arr[i];
			arr[i] = min;
			arr[index] = temp;
		}
		
		//check results
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}

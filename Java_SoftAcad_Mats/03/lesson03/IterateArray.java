package lesson03;

public class IterateArray {
	public static void main(String[] args) {
		
		int[] myArray = {3, 5, 9, 4, 2};
		
		for (int i = 0; i < myArray.length; i++) {
			System.out.print(myArray[i] + " ");
		}
		
		System.out.println(" now iterating with while");
		
		int i = 0;
		while (i < myArray.length) {
			System.out.print(myArray[i] + " ");
			i++;
		}
	}

}

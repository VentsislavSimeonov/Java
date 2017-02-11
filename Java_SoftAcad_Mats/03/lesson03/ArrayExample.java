package lesson03;

public class ArrayExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int[] arr;
		
		int[] myArray = new int[5];
		myArray[3] = 18;
		
		System.out.println(myArray[0]);
		System.out.println(myArray[1]);
		System.out.println(myArray[2]);
		System.out.println(myArray[3]);
		System.out.println(myArray[4]);
		
		myArray[3]= -18;
		System.out.println(myArray[3]);
		
		System.out.println(myArray.length);
		

	}

}

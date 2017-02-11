package lesson12;

public class ExeptionExample2 {
	
	static void printArrayInfo(int[] arr) {
		try{
			System.out.println("array length is : " + arr.length);
			System.out.println("some text");
			System.out.println("third element is : " + arr[2]);
		} catch(IndexOutOfBoundsException e) {
			System.out.println("IOBE");
		} catch (NullPointerException e) {
			System.out.println("NPE");
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] someArr = null;
		printArrayInfo(someArr);
		someArr = new int[0];
		printArrayInfo(someArr);
	}

}

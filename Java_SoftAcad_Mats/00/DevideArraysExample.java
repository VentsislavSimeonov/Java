package hw12;

public class DevideArraysExample {
//   THIS IS THE RIGHT WAT TO DEAL WITH ARITHMETICEXCEPTION ...	
//	static int[] devideArrays(int[] array1, int[] array2) {
//		if(array1 == null || array2 == null) {
//			throw new IllegalArgumentException("Both the arrays must be initialized!");
//		}
//		
//		int size = array1.length;
//		if(array2.length > array1.length) {
//			size = array2.length;
//		}
//		int[] result = new int[size];
//		
//		for (int i = 0; i < result.length; i++) {
//			if(i >= array1.length || i >= array2.length) {
//				result[i] = -1;
//			}else if(array2[i] == 0) {
//				result[i] = 0;
//			} else {
//				result[i] = array1[i] / array2[i];
//			}
//		}
//		return result;
//	}
	
	static int[] devideArrays(int[] array1, int[] array2) {
		int size = array1.length;
		if(array2.length > array1.length) {
			size = array2.length;
		}
		int[] result = new int[size];
		
		for (int i = 0; i < result.length; i++) {
			try {
				result[i] = array1[i] / array2[i];
			} catch (ArrayIndexOutOfBoundsException e) {
				result[i] = -1;
				//e.printStackTrace();
			} catch (ArithmeticException e) {
				result[i] = 0;
				//e.printStackTrace();
			}
		}
		return result;
	}
	
	public static void main(String[] args) {
		int[] arr1 = {2, 8, 9, -21, 1, 1, 1};
		int[] arr2 = {2, 0, 3};
		
		int[] result = devideArrays(arr1, arr2);
		//int[] result = devideArrays(null, arr2);
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i] + " ");
		}
	}
}

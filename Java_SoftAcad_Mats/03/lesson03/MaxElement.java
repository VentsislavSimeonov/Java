package lesson03;

import java.util.Scanner;

public class MaxElement {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int arr[] = new int[5];
		int max;
		Scanner input = new Scanner(System.in);
		
		//arr[0] = input.nextInt();
		
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = input.nextInt();
		}
		
		max = arr[0];
		
		for(int i = 0; i < arr.length; i ++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		
		System.out.println(max);
		
		
	}

}

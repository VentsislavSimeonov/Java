package hw02;

import java.util.Scanner;

public class Hw10 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Input n:");
		int n = scanner.nextInt();
		
		boolean isPrime = true;
		
		for(int i = 2; i < n/2; i++){
			if(n % i == 0){
				isPrime = false;
				break;
			}
		}
		if(isPrime && n != 1){
			System.out.println("number is prime");
		} else {
			System.out.println("number is not prime");
		}

		 
		

	}

}

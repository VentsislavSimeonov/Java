package hw02;

import java.util.Scanner;

public class Hw8 {
	
	public static void main (String[] args) {
		
		System.out.print("Input n: ");
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		int startingNumber = n - 1;
		
		for( int i = 1; i <= n ; i++){
			for( int a = 1; a <= n; a++){
				System.out.print(startingNumber);
			}
			System.out.println();
		}
	}

}

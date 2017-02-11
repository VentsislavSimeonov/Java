package lesson02;

import java.util.Scanner;

public class HomeWork4 {
	
	public static void main (String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Number1:");
		int number1 = sc.nextInt();
		System.out.println("Number2:");
		int number2 = sc.nextInt();
		if (number1>number2){
			System.out.println(number2 + " " + number1);
		} else {
			System.out.println(number1 + " " + number2);
		
		};
			
		
		
	}
	

}

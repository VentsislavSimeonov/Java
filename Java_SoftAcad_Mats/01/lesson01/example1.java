package lesson01;

import java.util.Scanner;

public class example1 {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a:");
		int a = input.nextInt();
		System.out.println("Enter b:");
		int b=input.nextInt();
		System.out.println("Enter c:");
		int c=input.nextInt();
		
		boolean bool = (a > b && a < c) || ( a < b && a > c); 
		System.out.println("Is a between b and c? " + bool);
		
		
		System.out.println( a > b  ==  a < c);
	}

}

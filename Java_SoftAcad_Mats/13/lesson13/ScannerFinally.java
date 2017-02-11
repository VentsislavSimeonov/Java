package lesson13;

import java.util.Scanner;

public class ScannerFinally {
	
	public static void main(String[] args) {
		ScannerFinally sf = new ScannerFinally();
		System.out.println(sf.callScanner());
	}

	private long callScanner() {
		Scanner scanner = null;
		try { 
			scanner = new Scanner(System.in);
			int i = scanner.nextInt();
			System.out.println("i = " + i); 
			System.out.println("We are about to return");
			return scanner.nextLong();
		} catch (RuntimeException e) {
			System.out.println("Runtime Exception was caught.");
			return -1;
		} catch (Exception e) {
			System.out.println("Exception was caught.");
			return -2;
		} finally  {
			System.out.println("Finally is about to run.");
			if( scanner != null) {
				scanner.close();
			}
		}
			
		}	

}

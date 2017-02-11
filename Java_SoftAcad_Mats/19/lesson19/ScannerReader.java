package lesson19;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class ScannerReader {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		File file = new File("D:\\javaTest\\iotest\\someFile2.txt");
		Scanner scanner = null;
		
//		try {
//			scanner = new Scanner(file);
//			while (scanner.hasNextLine()) {
//				System.out.println(scanner.nextLine());
//			}
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} finally {
//			if (scanner != null) {
//				scanner.close();
//			}
//		}
		InputStream inputStream = null;
		try {
			inputStream = new FileInputStream(file);
			scanner = new Scanner(inputStream);
			while (scanner.hasNextLine()) {
				System.out.println(scanner.nextLine());
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (scanner != null) {
				scanner.close();
			}
			if (inputStream != null) {
				try {
					inputStream.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
			
	}

}

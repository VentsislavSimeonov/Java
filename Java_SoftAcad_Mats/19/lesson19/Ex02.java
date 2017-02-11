package lesson19;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex02 {
	public static void main(String[] args) throws IOException {
		System.out.println("Exercise 2.");
		
		File f1 = new File("D:\\javaTest\\iotest\\Koala2.jpg");
		File f2 = new File("D:\\javaTest\\iotest\\Koala.jpg");

		boolean result = compareImages(f1, f2);
		System.out.println("EQ? " + result);

	}

	public static boolean compareImages(File f1, File f2) throws IOException {
		FileInputStream fis1 = new FileInputStream(f1);
		FileInputStream fis2 = new FileInputStream(f2);

//		int b1 = 0;
//		int b2 = 0;
//		while (b1 != -1 || b2 != -1) {
//			b1 = fis1.read();
//			b2 = fis2.read();
//			if (b1 != b2) {
//				return false;
//			}
//		}
//
//		return true;

		final int SIZE = 1024 * 8;
		byte[] buff1 = new byte[SIZE];
		byte[] buff2 = new byte[SIZE];

		int b1 = 0;
		int b2 = 0;
		while (b1 != -1 || b2 != -1) {
			b1 = fis1.read(buff1);
			b2 = fis2.read(buff2);

			for (int i = 0; i < SIZE; i++) {
				if (buff1[i] != buff2[i]) {
					return false;
				}
			}
		}

		return true;
	}
}

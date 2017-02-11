package lesson19;

import java.io.File;

public class RenameFileExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// D:\javaTest\iotest\someFile
		
		File file = new File("D:\\javaTest\\iotest\\someFile.txt");
		File file1 = new File("D:\\javaTest\\iotest\\someFile2.txt");
		boolean result = file.renameTo(file1);
		
		System.out.println(result);
	}

}

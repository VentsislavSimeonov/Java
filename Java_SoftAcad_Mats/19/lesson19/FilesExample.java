package lesson19;

import java.io.File;

public class FilesExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		File file1 = new File("C:\\Softacad\test.txt");
		File file2 = new File("..","\\test.txt");
		File file3 = new File("C:\\Softacad");
	}

}

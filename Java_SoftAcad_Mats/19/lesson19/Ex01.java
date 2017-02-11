package lesson19;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Ex01 {
	public static void main(String[] args) throws IOException {
		File javaTest = new File("D:\\javaTest");
		File iotest = new File(javaTest, "iotest");
		if (!iotest.isDirectory()) {
			iotest.mkdir();
		}

		File testTXT = new File(iotest, "test.txt");
		if (!testTXT.isFile()) {
			testTXT.createNewFile();
		}

		for (File file : iotest.listFiles()) {
			String fileName = file.getName();
			System.out.println(fileName);
			if (fileName.startsWith("t")) {
				file.delete();
			}
		}
		
		FileInputStream inputstream = new FileInputStream(testTXT);
	}
}

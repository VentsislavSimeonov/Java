package lesson19;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadTextFile {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		File file = new File("D:\\javaTest\\iotest\\someFile2.txt");
		
//		FileReader fileReader = null;
//		try {
//			fileReader = new FileReader(file);
//			int intRead = 0;
//			while((intRead = fileReader.read()) != -1) {
//				System.out.print((char) intRead);
//			}
//		} catch (FileNotFoundException e) {
//			
//		} catch (IOException e) {
//
//		}
//		finally {
//			if( fileReader != null) {
//				fileReader.close();
//			}
//		}
		
		FileReader fileReader = null;
		try {
			fileReader = new FileReader(file);
			char[] buff = new char[128];
			while(fileReader.read(buff) != -1) {
				System.out.print(buff);
			}
		} catch (FileNotFoundException e) {
			
		} catch (IOException e) {

		}
		finally {
			if( fileReader != null) {
				fileReader.close();
			}
		}
		


	}

}

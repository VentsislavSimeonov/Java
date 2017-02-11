package lesson19.serialization;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class ObjectWriterExcercise {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		File cars = new File("D:\\javaTest\\iotest\\cars");
		if (!cars.exists()) {
			try {
				cars.createNewFile();
			} catch (IOException e) {
				System.err.println("Could not create file");
				System.exit(-1);
			}
		}
		
		Car bmw =  new Car("M3", true, "RED");
		Car opel = new Car("Vectra", false, "GREY");
		
		OutputStream os = null;
		ObjectOutputStream oos = null;
		try {
			os = new FileOutputStream(cars);
			oos = new ObjectOutputStream(os);
			
			oos.writeInt(2);
			oos.writeObject(bmw);
			oos.writeObject(opel);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch ( IOException e) {
			e.printStackTrace();
		} finally {
			if (os != null) {
				try {
					os.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			
			if (oos != null) {
				try {
					oos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

	}

}

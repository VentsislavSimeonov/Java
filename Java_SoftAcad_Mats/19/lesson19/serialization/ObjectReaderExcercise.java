package lesson19.serialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;

public class ObjectReaderExcercise {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		File cars = new File("D:\\javaTest\\iotest\\cars");
		if (!cars.exists()) {
			System.err.println("File cars does not exist.");
			System.exit(-1);
		}
		
		InputStream is = null;
		ObjectInputStream ois = null;
		try {
			is = new FileInputStream(cars);
			ois = new ObjectInputStream(is);
			
			int numberOfCars = ois.readInt();
			System.out.println("number of cars read " + numberOfCars);
			
			Object obj = ois.readObject();
			if (obj instanceof Car) {
				Car car = (Car) obj;
				System.out.println(car.color);
				System.out.println(car.model);
				System.out.println(car.isSportCar);
			}
			
			Object obj2 = ois.readObject();
			if (obj2 instanceof Car) {
				Car car = (Car) obj2;
				System.out.println(car.color);
				System.out.println(car.model);
				System.out.println(car.isSportCar);
			}


		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		

	}

}

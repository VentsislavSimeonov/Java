package lesson20;

import java.util.List;

public class CompareCars {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Car car1 = new Car("BMW", true, "RED", 20000, 190);
		Car car2 = new Car("Opel", true, "ORANGE", 2000, 155);
		
		System.out.println("Is car1 more than car2? " + car1.compareTo(car2));
		System.out.println(car2.compareTo(car1));
		
		
	}

}

package lesson06;

public class Demo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Car car1 = new Car("Volvo", false, "white");
		Car car2 = new Car("Mercedez", true, "black");

		boolean isMoreExpensive = car1.isMoreExpensive(car2);
		System.out.println(isMoreExpensive);
	}

}

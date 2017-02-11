package lesson06;

public class CarDemo {
	public static void main(String[] args) {
		Car ford = new Car("Ford", false, "Red");
		Car bmw = new Car("BMW", true, "Black", 200000, 280);
		
		System.out.println(ford.isMoreExpensive(bmw));
		double priceForScrap = ford.calculateCarPriceForScrap(200);
		System.out.println("Price for scrap: " + priceForScrap);
	}
}

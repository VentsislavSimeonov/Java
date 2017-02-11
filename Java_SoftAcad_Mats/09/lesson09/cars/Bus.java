package lesson09.cars;

public class Bus extends Car {
	
	protected int numberOfSeats;
	
	public int placesForLuggage;
	
	public Bus(String model, String color, double price, double maxSpeed) {
		super(model, false, color, price, maxSpeed);
		
		numberOfSeats = 45;
		placesForLuggage = 30;
	}
}

package lesson09.cars;


public class CarsDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Ferrari ferrari = new Ferrari("458", "RED");
		Ferrari someFerrari = new Ferrari("458", "RED");
		System.out.println(ferrari.currentSpeed);
		ferrari.switchTurbo();
		
		ferrari.changeGearUp();
		ferrari.changeGearDown();
		
		Bus bus = new Bus("Chavdar", "Green", 10000, 65);
		System.out.println(bus.numberOfSeats);
		System.out.println(bus.placesForLuggage);
		
		bus.changeGearUp();
		System.out.println(bus.calculateCarPriceForScrap(1.15));
		
		ferrari.startEngine();
		
		System.out.println(ferrari);
		
		System.out.println(ferrari.equals(bus));
		System.out.println(someFerrari);
		System.out.println(someFerrari.equals(ferrari));
	}

}

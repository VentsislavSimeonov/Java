package lesson21.vehicles;


public class VehicleStoreDemo {
	public static void main(String[] args) {
		VehicleStore<Car, City> carStore =
				new VehicleStore<Car, City>(new City());
		VehicleStore<Tracktor, Country> tracktorStore =
				new VehicleStore<Tracktor, Country>(new Country());
		VehicleStore<Truck, Country> truckStore =
				new VehicleStore<Truck, Country>(new Country());
		
		carStore.add(new Car());
		// carStore.add(new Tracktor());
		tracktorStore.add(new Tracktor());
		truckStore.add(new Truck());
		
		carStore.setLocation(new City());
		// carStore.setLocation(new Country());
		tracktorStore.setLocation(new Country());
		truckStore.setLocation(new Country());
		
		Car c = carStore.getFirst();
		Tracktor t = tracktorStore.getFirst();
		Truck tr = truckStore.getFirst();
		
		carStore.getLocation();
		truckStore.getLocation();
		
		VehicleStore<IVehicle, City> ivVS =
				new VehicleStore<IVehicle, City>(new City());
		ivVS.add(c);
		ivVS.add(t);
		ivVS.add(tr);
		
		// ivVS.add(new Object());
		
//		VehicleStore<AbstractVehicle, City> avVS =
//				new VehicleStore<AbstractVehicle, City>(new City());
//		
//		avVS.add(c);
//		avVS.add(tr);
//		avVS.add(t);
		
		//VehicleStore<Mammal, City> mammalStore = new VehicleStore<Mammal, City>(new City());
		//VehicleStore<Bird, City> birdStore = new VehicleStore<Bird, City>(new City());
		
		//VehicleStore<Car, Bird> bStore = new VehicleStore<Car, Bird>(new Bird());
		
		visit(carStore);
//		visit(tracktorStore);
//		visit(truckStore);
//		visit(ivVS);
	}
	
	private static void visit(VehicleStore<? extends Car, ? extends Location> vs) {
		//...
	}
}

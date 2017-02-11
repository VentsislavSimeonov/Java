package lesson21.vehicles;

import java.util.ArrayList;
import java.util.List;

public class VehicleStore<T extends IVehicle, U extends Location> {
	private List<T> vehicles;
	private U location;
	
	public VehicleStore(U location) {
		vehicles = new ArrayList<T>();
		this.location = location;
	}
	
	public VehicleStore(List<T> vehicles, U location) {
		this.vehicles = vehicles;
		this.location = location;
	}
	
	public void add(T vehicle) {
		vehicles.add(vehicle);
	}
	
	public T getFirst() {
		return vehicles.get(0);
	}
	
	public List<T> getAll() {
		return vehicles;
	}
	
	public U getLocation() {
		return location;
	}
	
	public void setLocation(U location) {
		this.location = location;
	}
}

package lesson09.cars;

public class Jeep extends Car {
	
	void driveOffroad() {
		System.out.println("jeep is driving offroad");
	}
	
	void switch4x4() {
		System.out.println("jeep has turned 4x4 on");
	}
	
	public Jeep(String model, String color) {
		super(model, false, color);
	}
}

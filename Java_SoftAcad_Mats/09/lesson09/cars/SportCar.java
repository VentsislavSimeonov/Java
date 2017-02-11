package lesson09.cars;

import lesson09.constructorchaining.B;

public class SportCar extends Car {
	
	private boolean isCabriolet;
//	protected double price;
	
	public B switchTurbo() {
		currentSpeed *= 1.2;
		System.out.println("current speed " + currentSpeed);
		return new B();
	}

	public SportCar(String model, String color ) {
		super(model, true, color);
	}
	
	protected double calcPrice(String model, String color, int year) {
		// some calculation goes here... 
		return price + 400;
	}
	
	public void startEngine() {
		super.startEngine();
		switchTurbo();
	}
	
}

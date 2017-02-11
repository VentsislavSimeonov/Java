package lesson09.cars;

import lesson09.constructorchaining.C;

public class Ferrari extends SportCar {

	protected double price;
	
	public Ferrari(String model, String color) {
		super(model, color);
		this.price = 5;
		super.price = 10;
		super.price = 15;
		
		price = calcPrice(model, color, 1980);
	}

	public C switchTurbo() {
		System.out.println("Ferrari is switching on turbo.");
		return new C();
	}

}

package lesson05;

public class Car {
	
	String model;
	double maxSpeed;
	double currentSpeed;
	String color;
	int currentGear;
	
	Person owner;
	
	void accelerate() {
		currentSpeed += 10;
		if (currentSpeed > maxSpeed) {
			currentSpeed = maxSpeed;
		}
	}
	
	void changeGearUp() {
		if (currentGear < 5) {
			currentGear++;
		}
	}
	
	void changeGearDown() {
		if (currentGear > 1) {
			currentGear--;
		}
	}
	
	void changeGear(int newGear) {
		if (1 <= newGear && newGear <=5) {
			currentGear = newGear;
		}
	}

	void changeColor(String newColor) {
		color = newColor;
	}
}

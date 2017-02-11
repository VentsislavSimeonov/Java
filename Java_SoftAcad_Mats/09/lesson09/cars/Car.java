package lesson09.cars;

public class Car {
	
	String model;
	double maxSpeed;
	double currentSpeed;
	String color;
	int currentGear;
	Person owner;
	protected double price;
	boolean isSportCar;
	
	Car(String model, boolean isSportCar, String color) {
		this.model = model;
		this.isSportCar = isSportCar;
		this.color = color;
		currentSpeed = 0;
		currentGear = 1;
	}
	
	Car(String model, boolean isSportCar, String color, double price, double maxSpeed) {
		this(model, isSportCar, color);
		this.price = price;
		if(!isSportCar && maxSpeed > 200) {
			this.maxSpeed = 200;
		} else {
			this.maxSpeed = maxSpeed;
		}
	}
	
	void accelerate() {
		currentSpeed += 10;
		//System.out.println("Accelerating current speed with 10");
	}
	
	void changeGearUp() {
		if(currentGear < 5) {
			currentGear ++;
			System.out.println("Changing gear to " + currentGear);
		} else {
			System.out.println("Sorry the max gear is 5th");
		}
	}
	
	void changeGearDown() {
		if(currentGear > 1) {
			currentGear --;
		} else {
			System.out.println("Sorry the min gear is 1st");
		}
	}
	
	void changeGear(int newGear) {
		if(newGear >= 1 && newGear <= 5) {
			currentGear = newGear;
			System.out.println("Changing gear to " + currentGear);
		} else {
			System.out.println("Sorry wrong gear!");
		}
	}
	
	void changeColor(String newColor) {
		color = newColor;
		System.out.println("Changing color to " + newColor);
	}
	
	boolean isMoreExpensive(Car car) {
		if(this.price > car.price) {
			return true;
		} 
		return false;
	}
	
	double calculateCarPriceForScrap(double metalPrice) {
		double coef = 0.2;
		if (this.color.equals("Black") || this.color.equals("White")) {
			coef += 0.05;
		}
		if (this.isSportCar) {
			coef += 0.05;
		}
		double price = metalPrice * coef; 
		
		return price;
	}
	
	void changeOwner(Person newOwner) {
		this.owner = newOwner;
		newOwner.car = this;
	}
	
	public void startEngine() {
		System.out.println("engine is started");
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + currentGear;
		long temp;
		temp = Double.doubleToLongBits(currentSpeed);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + (isSportCar ? 1231 : 1237);
		temp = Double.doubleToLongBits(maxSpeed);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((model == null) ? 0 : model.hashCode());
		result = prime * result + ((owner == null) ? 0 : owner.hashCode());
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Car))
			return false;
		Car other = (Car) obj;
		if (this.isSportCar == other.isSportCar &&
				this.color.equals(other.color) &&
				this.maxSpeed == other.maxSpeed &&
				this.model.equals(other.model) && 
				this.price == other.price) {
			return true;
		} 
		return false;
	}
	
	public String toString() {
		return "isSportCar: " + this.isSportCar + " ;color: " +
				this.color + " ; maxSpeed: " + this.maxSpeed + 
				" ;model: " + this.model + " ;price: " + this.price;
	}

}

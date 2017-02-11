package lesson05;

public class CarDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Car volvo = new Car();
		volvo.color = "white";
		volvo.maxSpeed = 215.6;
		volvo.currentSpeed = 0;
		volvo.currentGear = 1;
		volvo.model = "Volvo";
		
		System.out.println("Current speed " + volvo.currentSpeed);
		
		volvo.currentGear = 3;
		volvo.currentSpeed = 34;
		
		System.out.println("Volvo's current speed " + volvo.currentSpeed);
		System.out.println("Volvo's current gear " + volvo.currentGear);
		
		Car mercedez = new Car();
		mercedez.color = "red";
		mercedez.currentGear = 2;
		mercedez.currentSpeed = 20;
		mercedez.maxSpeed = 190;
		mercedez.model = "Mercedes Benz";
		
		Person pencho = new Person();
		pencho.age = 25;
		pencho.name = "Pencho Vladigerov";
		pencho.isWoman = false;
		pencho.weight = 82;
		
		mercedez.owner = pencho;
		
		Person ivan = new Person();
		ivan.name = "Ivan Ivanov";
		
		volvo.owner = ivan;
		
		System.out.println("Cars owner name: " + mercedez.owner.name);
		System.out.println("Volvo's owner: " + volvo.owner.name);
		
		Person somePerson = mercedez.owner;
		System.out.println(somePerson.name);
		
		System.out.println("Do we have the same owner?" + (somePerson == pencho));
		
		
		mercedez.changeGear(4);
		System.out.println(mercedez.model + " is in " + mercedez.currentGear + " gear.");
		mercedez.changeGearUp();
		System.out.println(mercedez.model + " is in " + mercedez.currentGear + " gear.");
		mercedez.changeGearUp();
		System.out.println(mercedez.model + " is in " + mercedez.currentGear + " gear.");
		
		mercedez.changeGearDown();
		System.out.println(mercedez.model + " is in " + mercedez.currentGear + " gear.");
		mercedez.changeGear(1);
		System.out.println(mercedez.model + " is in " + mercedez.currentGear + " gear.");
		mercedez.changeGearDown();
		System.out.println(mercedez.model + " is in " + mercedez.currentGear + " gear.");
		
		System.out.println("the car has color: " + mercedez.color);
		mercedez.changeColor("Pink");
		System.out.println("the car has color: " + mercedez.color);
		
		System.out.println("cars current speed: " + mercedez.currentSpeed);
		mercedez.accelerate();
		System.out.println("cars current speed: " + mercedez.currentSpeed);
		mercedez.currentSpeed = 185;
		System.out.println("cars current speed: " + mercedez.currentSpeed);
		mercedez.accelerate();
		System.out.println("cars current speed: " + mercedez.currentSpeed);
		
		String someString = "Milena";
		System.out.println(someString.toUpperCase());
		System.out.println(someString.toLowerCase());
		System.out.println(someString.charAt(0));
		System.out.println(someString.charAt(5));
		
	}

}

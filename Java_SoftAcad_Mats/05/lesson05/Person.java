package lesson05;

public class Person {
	
	public int age;
	String personalNumber;
	String name;
	double weight;
	boolean isWoman;
	
	Person friend;
	
	void eat() {
		System.out.println(name + " is eating");
	}
	
	void walk() {
		System.out.println(name + " is walking");
	}
	
	void drink(double litters) {
		if (litters > 0 && litters < 1.5) {
			System.out.println(name + " is drinking water.");
		} else {
			System.out.println("Qantity ain't right... ");
		}
	}
	
	void growUp() {
		age++;
	}

}

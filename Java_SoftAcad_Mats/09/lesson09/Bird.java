package lesson09;

public class Bird extends Animal {
	double flyingSpeed;
	
	public int age = 5;
	
	void fly() {
		System.out.println("flying... ");
		System.out.println("age " +  age);
		System.out.println("super.age " + super.age);
	}
	
	void walk() {
		System.out.println("bird is walking");
		super.walk();
	}
}

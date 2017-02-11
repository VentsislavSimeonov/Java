package lesson10.animal;

public class Fish extends Animal {

	@Override
	void makeSomeNoise() {
		System.out.println("some noise from a fish");
	}
	
	void breath(){
		System.out.println("fish is breathing.");
	}
	
	void swim() {
		System.out.println("swim like a fish.");
	}

}

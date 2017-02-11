package lesson10.animal;

public class Dog extends Animal {
	boolean isDangerous;
	
	void bringStick() {
		System.out.println("bringing the stick.");
	}

	@Override
	void makeSomeNoise() {
		System.out.println("Dog is making some noise.");
	}
	
	void breath() {
		System.out.println("dog is breathing.");
	}
	
	
}

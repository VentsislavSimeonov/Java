package lesson10.animal;

public abstract class Animal {
	public int age = 8;
	double weight;
	
	void breath() {
		System.out.println("the animal is breathing...");
	}
	
	void walk() {
		System.out.println("the animal is walking");
	}
	
	abstract void makeSomeNoise();
}

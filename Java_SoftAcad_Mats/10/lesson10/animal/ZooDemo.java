package lesson10.animal;

public class ZooDemo {
	public static void main(String[] args) {
		Zoo zoo = new Zoo(5);
		
		Fish fish = new Fish();
		Dog dog = new Dog();
		
		zoo.addAnimal(dog);
		zoo.addAnimal(fish);
		
		for (int i = 0; i < zoo.getAnimals().length; i++) {
			if (zoo.getAnimals()[i] != null) {
				zoo.getAnimals()[i].breath();
				zoo.getAnimals()[i].makeSomeNoise();
			}
		}
		
		Animal dog2 = new Fish();
		((Dog)dog2).bringStick();
		
		Animal animal = new Dog();
		if (animal instanceof Dog) {
			((Dog)animal).bringStick();
		}
		
		//if animal instanceof Dog)
		Animal fish2 = new Fish();
		//fish2.swim();
	
	}
}

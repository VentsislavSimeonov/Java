package lesson09;

public class AnimalDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.age = 12;
		System.out.println("the dog is " + dog.age + " years old.");
		dog.breath();
		dog.bringStick();
		dog.walk();
		
		Bird bird = new Bird();
		bird.flyingSpeed = 14.1;
		bird.breath();
		System.out.println("**********************");
		bird.fly();
		bird.walk();
		
		System.out.println("**********************");
		Animal animal = new Bird();
		animal.walk();

	}

}

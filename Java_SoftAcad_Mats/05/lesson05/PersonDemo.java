package lesson05;

public class PersonDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Person ivan = new Person();
		ivan.age = 25;
		ivan.isWoman = false;
		ivan.personalNumber = "8205251818";
		ivan.weight = 80.5;
		ivan.name ="Ivan Ivanov";
		
		System.out.println(ivan.personalNumber);
		
		ivan.personalNumber = "8105444233";
		
		System.out.println(ivan.personalNumber);
		
		Person person = new Person();
		person.name = "Maria";
		person.isWoman = true;
		person.weight = 50;
		
		ivan.friend = person;
		
		System.out.println("Ivan has a friend : " + ivan.friend.name);
		
		
		ivan.walk();
		ivan.eat();
		ivan.growUp();
		System.out.println(ivan.name + " is " + ivan.age + " years old");
		ivan.growUp();
		System.out.println(ivan.name + " is " + ivan.age + " years old");
		
		double water = 1;
		ivan.drink(water);
		
		ivan.drink(5);

	}

}

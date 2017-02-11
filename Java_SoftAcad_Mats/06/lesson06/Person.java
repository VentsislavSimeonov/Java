package lesson06;

public class Person {
	String name;
	int age;
	long personalID;
	boolean isMale;
	double weight;
	Person[] friends;
	Person mother;
	double money;
	Car car;
	
	Person() {
		age = 0;
		weight = 4.5;
	}
	
	Person(int age, String name, long personalID) {
		this.age = age;
		this.name = name;
		this.personalID = personalID;
	}
	
	Person(int age, String name, long personalID, double weight) {
		this(age, name, personalID);
		this.weight = weight;
	}
	
	Person(String name, long personalID, boolean isMale, int friendsNum) {
		this();
		this.name = name;
		this.personalID = personalID;
		this.isMale = isMale;
		this.friends = new Person[friendsNum];
	}
	
	void eat() {
		System.out.println("Eating...");
	}
	
	void walk() {
		System.out.println(name + " is walking like a boss :)");
	}
	
	void growUp() {
		age ++;
	}
	
	void drinkWater(double liters) {
		if(liters <= 2 ) {
			System.out.println(name + " is drinking " + liters + " liters water");
		} else {
			System.out.println("Too much water!");
		}
	}
	
	int getFriendsNumber() {
		int number = friends.length;
		return number;
	}
	
	void buyCar(Car car) {
		
		if(this.money < car.price) {
			System.out.println("Sorry, not enought money!");
			return;
		}
		this.car = car;
		this.money -= car.price;
		car.changeOwner(this);
	}
	
	void sellCarForScrap() {
		if(this.car == null) {
			System.out.println("Sorry no car for scrap!");
			return;
		}
		double carPriceForScrap = this.car.calculateCarPriceForScrap(100);
		this.money += carPriceForScrap;
		this.car = null;
	}
}

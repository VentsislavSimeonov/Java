package lesson06;

public class PersonDemo {
	public static void main(String[] args) {
		Person petq = new Person();
		System.out.println(petq.name);
		
		Person ivan = new Person(102, "Petar", 425435, 60);
		System.out.println(petq.name);
		
		Person martin = new Person("Martin", 2435, true, 20);
//		int friendsNumber = martin.getFriendsNumber();
//		System.out.println(martin.name + " has " + friendsNumber + " friends");
		System.out.println(martin.name + " has " + martin.getFriendsNumber() + " friends");
		
		//copilation error
		//String walking = martin.walk();
		
		Car mercedes = new Car("Mercedes S500", true, "Blue", 300000, 290);
		martin.money = 4000000;
		martin.buyCar(mercedes);
		
		mercedes.changeOwner(petq);
	}
}

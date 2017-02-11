package hw09;

public class Person {
	private String name;
	private int age;
	private boolean isMale;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public boolean getIsMale() {
		return isMale;
	}
	public void setIsMale(boolean isMale) {
		this.isMale = isMale;
	}
	
	public Person(String name, int age, boolean isMale) {
		this.name = name;
		this.age = age;
		this.isMale = isMale;
	}
	
	public void showPersonInfo() {
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("IsMale: " + isMale);
	}
	
	
}

package lesson07.godexamplee;

public class God {
	private final String name;
	
	public God(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void doSomeMiricle() {
		System.out.println("Miricle!!!!");
	}
	
	public void changeWeather(String weather) {
		System.out.println("Our god " + name + " change weather to " + weather);
	}
}

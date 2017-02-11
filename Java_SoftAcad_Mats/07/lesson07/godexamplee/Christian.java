package lesson07.godexamplee;
 public class Christian {
	private String name;
	private int age;
	private static God god = new God("Jesus");
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}
	
	public static void setGod(God newGod) {
		god = newGod;
	}
	
	public void prayGodToChangeWeather(String weather) {
		god.changeWeather(weather);
	}
}

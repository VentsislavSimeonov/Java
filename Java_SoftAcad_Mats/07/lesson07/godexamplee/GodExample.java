package lesson07.godexamplee;

public class GodExample {
	public static void main(String[] args) {
		God jesus = new God("Jesus");
		God allah = new God("Allah");
		
		jesus.doSomeMiricle();
		//jesus.changeWeather("Sunny");
		
		Christian neno = new Christian();
		neno.prayGodToChangeWeather("Slunche");
		
		Christian ivan = new Christian();
		ivan.prayGodToChangeWeather("Sunny");
		
		Christian.setGod(allah);
		ivan.setGod(jesus);
		ivan.prayGodToChangeWeather("Rainy");
		
		neno.prayGodToChangeWeather("Ke vali");
	}
}

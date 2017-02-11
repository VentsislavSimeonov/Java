package lesson21.animals;

public class Zoo {
	public static void main(String[] args) {
		Cage<Mammal> mCage = new Cage();
		Cage<Bird> bCage = new Cage();
		
		mCage.addAnimal(new Mammal());
		bCage.addAnimal(new Bird());
		
		bCage.contains(new Bird());
		bCage.contains(new Mammal());
		
		cleanCage(mCage);
		cleanCage(bCage);
	}
	
	static <T extends IAnimal> void cleanCage(Cage<T> cage) {
		for (T t : cage.getAllAnimals() ){
			System.out.println("clean animal " + t);
		}
	}
}

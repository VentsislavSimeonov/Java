package lesson10.animal;


public class Zoo {
	private Animal[] animals;
	
	public Zoo(int cages) {
		animals = new Animal[cages];
	}
	
	public void addAnimal(Animal newAnimal) {
		for (int i = 0; i < animals.length; i++) {
			if(animals[i] == null) {
				animals[i] = newAnimal;
				return;
			}
		}
		System.out.println("No free cages for more animals!");
	}

	public Animal[] getAnimals() {
		return animals;
	}
}


package lesson21.animals;

import java.util.ArrayList;
import java.util.List;

public class Cage<T extends IAnimal> {
	private List<T> animals;
	
	public Cage() {
		animals = new ArrayList<T>();
	}
	
	public void addAnimal(T animal) {
		animals.add(animal);
	}
	
	public List<T> getAllAnimals() {
		return animals;
	}
	
	public <U extends IAnimal> boolean contains(U animal) {
		return animals.contains(animal);
	}
	
}

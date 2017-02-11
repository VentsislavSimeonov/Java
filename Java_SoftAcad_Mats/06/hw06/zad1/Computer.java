package hw06.zad1;

public class Computer {
	
	public class Keyboard {
		
	}
	
	Keyboard keyboard = new Keyboard();
	
	private int year;
	public double price;
	boolean isNotebook;
	double hardDiskMemory;
	double freeMemory;
	String operationSystem;
	
	Computer() {
		isNotebook = false;
		this.operationSystem = "Win XP";
	}
	
	Computer(int year, double price, double hardDiskMemory, double freeMemory) {
		this();
		this.year = year;
		this.price = price;
		this.hardDiskMemory = hardDiskMemory;
		this.freeMemory = freeMemory;
	}
	
	Computer(int year, double price, boolean isNotebook, 
			double hardDiskMemory, double freeMemory, String operationSystem) {
		this(year, price, hardDiskMemory, freeMemory);
		this.isNotebook = isNotebook;
		this.operationSystem = operationSystem;
	}
	
	void changeOperationSystem(String newOperationSystem) {
		operationSystem = newOperationSystem;
		System.out.println("The new operation system is " + newOperationSystem);
	}
	
	void useMemory(double memory) {
		if(memory < freeMemory) {
			freeMemory -= memory;
		} else {
			System.out.println("Not enought memory!");
		}
	}
	
	int comparePrice(Computer comp) {
		if (this.price > comp.price) {
			return -1;
		}
		if(this.price == comp.price) {
			return 0;
		} 
		return 1;
	}
}

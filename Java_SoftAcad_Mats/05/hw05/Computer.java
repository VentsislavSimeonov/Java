package hw05;

public class Computer {
	int year;
	double price;
	boolean isNotebook;
	double hardDiskMemory;
	double freeMemory;
	String operationSystem;
	
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
	
	
}

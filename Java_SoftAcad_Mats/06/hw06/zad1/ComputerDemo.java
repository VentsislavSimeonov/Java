package hw06.zad1;

import hw06.zad1.Computer.Keyboard;
import hw06.zad2.Student;

public class ComputerDemo {
	public static void main(String[] args) {
		Computer hp = new Computer();
		Computer dell = new Computer();
		dell.changeOperationSystem("Linux");
		
		hp.hardDiskMemory = 2000;
		hp.freeMemory = 2000;
		hp.isNotebook = true;
		
		hp.useMemory(100);
		System.out.println(hp.freeMemory);
		
		Computer comp2 = new Computer(2004, 1000, 300, 300);
		
		int result = comp2.comparePrice(hp);
		if(result == -1) {
			System.out.println("The first computer has higher price");
		} else {
			System.out.println("The first computer has NOT higher price");
		}
		
		Keyboard k = comp2.new Keyboard();
		
		Student st = new Student();
		st.age  = 5; 
	}
}

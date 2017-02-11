package hw05;

public class ComputerDemo {
	public static void main(String[] args) {
		Computer hp = new Computer();
		Computer dell = new Computer();
		
		hp.hardDiskMemory = 2000;
		hp.freeMemory = 2000;
		hp.isNotebook = true;
		hp.year = 2010;
		hp.price = 100;
		hp.operationSystem = "Windows 8";
		
		dell.freeMemory = 6000;
		dell.hardDiskMemory = 3000;
		dell.isNotebook = false;
		dell.year = 2013;
		dell.price = 700;
		dell.operationSystem = "Ubuntu";
		
		dell.changeOperationSystem("Linux");
		hp.useMemory(100);

		System.out.println("hp free memory: " + hp.freeMemory);
		System.out.println("hp hard disk memory: " + hp.hardDiskMemory);
		System.out.println("hp operation system: " + hp.operationSystem);
		System.out.println("hp price: " + hp.price);
		System.out.println("hp year: " + hp.year);
		System.out.println("hp is notebook: " + hp.isNotebook);
		System.out.println();
		
		System.out.println("dell free memory: " + dell.freeMemory);
		System.out.println("dell hard disk memory: " + dell.hardDiskMemory);
		System.out.println("dell operation system: " + dell.operationSystem);
		System.out.println("dell price: " + dell.price);
		System.out.println("dell year: " + dell.year);
		System.out.println("dell is notebook: " + dell.isNotebook);
		
	}
}

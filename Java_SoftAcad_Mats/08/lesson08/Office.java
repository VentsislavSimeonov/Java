package lesson08;

public class Office {

	public static void main(String[] args) {
		AllWork allWork = new AllWork();
		
		Task t1 = new Task("Task 1", 15);
		Task t2 = new Task("Task 2", 4);
		Task t3 = new Task("Task 3", 6);
		Task t4 = new Task("Task 4", 1);
		Task t5 = new Task("Task 5", 32);
		Task t6 = new Task("Task 6", 40);
		Task t7 = new Task("Task 7", 18);
		Task t8 = new Task("Task 8", 2);
		Task t9 = new Task("Task 9", 3);
		Task t10 = new Task("Task 10", 2);
		
		allWork.addTask(t1);
		allWork.addTask(t2);
		allWork.addTask(t3);
		allWork.addTask(t4);
		allWork.addTask(t5);
		allWork.addTask(t6);
		allWork.addTask(t7);
		allWork.addTask(t8);
		allWork.addTask(t9);
		allWork.addTask(t10);
		
		Employee e1 = new Employee("Ivan");
		Employee e2 = new Employee("Niki");
		Employee e3 = new Employee("Tina");
		
		Employee.setAllWork(allWork);
		
		int day = 1;
		while (!allWork.isAllWorkDone()) {
			System.out.println("Day " + day + " starts.");
			
			e1.startWorkingDay();
			e2.startWorkingDay();
			e3.startWorkingDay();
			
			e1.work();
			e2.work();
			e3.work();
			
			day++;
		}
		
		
		
	}
}

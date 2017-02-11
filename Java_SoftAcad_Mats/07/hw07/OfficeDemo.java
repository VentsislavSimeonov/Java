package hw07;

public class OfficeDemo {
	public static void main(String[] args) {
		Task task1 = new Task("Task 1", 3);
		Task task2 = new Task("Task 2", 20);
		
		System.out.println(task2.getWorkingHours());
		
		Employee employee = new Employee("Nikola");
		System.out.println(employee.getHoursLeft());
		
		employee.setHoursLeft(168);
		employee.setCurrentTask(task2);
		employee.work();
	}
}

package hw07;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Task testTask = new Task("pencho", 8);
		testTask.setName("Gosho");
		System.out.println(testTask.getName());
		
		testTask.setName("");	
		System.out.println("*" + testTask.getName() + "*");
		
		Employee employee = new Employee("Ivan Ivanov");
		System.out.println(employee.getHoursLeft());
		employee.setHoursLeft(5);
		
		System.out.println(employee.getHoursLeft());
		
		
	}

}

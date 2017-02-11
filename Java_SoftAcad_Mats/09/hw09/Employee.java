package hw09;

public class Employee extends Person {
	public static final int MIN_AGE_FOR_OVERTIME = 18;
	public static final int WORKING_HOURS_PER_DAY = 8;
	public static final double OVERTIME_COEFICIENT = 1.5;
	
	private double daySalary;
	
	public Employee(String name, int age, boolean isMale, double daySalary) {
		super(name, age, isMale);
		this.daySalary = daySalary;
	}
	
	public double calculateOvertime(double hours) {
		if(getAge() < MIN_AGE_FOR_OVERTIME) {
			return 0;
		}
		double overtime = (daySalary / WORKING_HOURS_PER_DAY) * OVERTIME_COEFICIENT * hours;
		return overtime;
	}
	
	public void showEmployeeInfo() {
		showPersonInfo();
		System.out.println("Day salary: " + daySalary);
	}
	
}

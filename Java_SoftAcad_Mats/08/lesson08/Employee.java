package lesson08;

public class Employee {
	public static int ONE_DAY_WORKING_HOURS = 8;
	
	private static AllWork allWork;
	
	private String name;
	private Task currentTask;
	private int hoursLeft;
	
	public Employee(String name) {
		setName(name);
		hoursLeft = ONE_DAY_WORKING_HOURS;
	}
	
	public void setName(String name) {
		if( name != null) {
			this.name = name;
		} else {
			this.name = "";
		}
	}
	
	public String getName() {
		return name;
	}
	
	public void setHoursLeft(int hoursLeft) {
		if(hoursLeft >= 0) {
			this.hoursLeft = hoursLeft;
		}
	}
	
	public int getHoursLeft() {
		return hoursLeft;
	}
	
	public void setCurrentTask(Task currentTask) {
		if(currentTask != null && currentTask.getWorkingHours() > 0 ) {
			this.currentTask = currentTask;
		} else {
			this.currentTask = null;
			System.out.println("Not valid task!!!");
		}
	}
	
	public Task getCurrentTask() {
		return currentTask;
	}
	
	public void work() {
		if (currentTask == null) {
			setCurrentTask(allWork.getNextTask());
		}
		
		while(this.hoursLeft > 0 && currentTask != null) {
			System.out.println(getName() + " currentTask " + currentTask.getName());
			if (currentTask == null) {
				break;
			}
			
			int hoursForWork = this.hoursLeft;
			if(this.hoursLeft > currentTask.getWorkingHours()) {
				hoursForWork = currentTask.getWorkingHours();
			}
			hoursLeft -= hoursForWork;
			currentTask.setWorkingHours(currentTask.getWorkingHours() - hoursForWork);

			showReport();
			if (currentTask.getWorkingHours() == 0) {
				setCurrentTask(allWork.getNextTask());
			}
		}
	}
	
	public void showReport() {
		System.out.println("Employee name: " + name);
		System.out.println("Task: " + currentTask.getName());
		System.out.println("Employee hours left: " + hoursLeft);
		System.out.println("Task hours left: " + currentTask.getWorkingHours());
	}
	
	public static AllWork getAllWork() {
		return allWork;
	}
	
	public static void setAllWork(AllWork allWork) {
		Employee.allWork = allWork;
	}
	
	public void startWorkingDay() {
		hoursLeft = ONE_DAY_WORKING_HOURS;
		System.out.println("Working day starts for Employee " + this.name);
	}
	
}

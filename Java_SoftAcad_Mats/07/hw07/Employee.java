package hw07;

public class Employee {
	public static int ONE_DAY_WORKING_HOURS = 8;
	
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
			System.out.println("Not valid task!!!");
		}
	}
	
	public Task getCurrentTask() {
		return currentTask;
	}
	
	public void work() {
		if(currentTask == null) {
			System.out.println("No current task assigned to " + name);
			return;
		}
		
		int hoursForWork = this.hoursLeft;
		if(this.hoursLeft > currentTask.getWorkingHours()) {
			hoursForWork = currentTask.getWorkingHours();
		}
		hoursLeft -= hoursForWork;
		//currentTask.workingHours = currentTask.workingHours - hoursForWork;
		currentTask.setWorkingHours(currentTask.getWorkingHours() - hoursForWork);
		
//		if(hoursLeft > currentTask.getWorkingHours()) {
//			hoursLeft -= currentTask.getWorkingHours();
//			currentTask.setWorkingHours(0);
//		} else {
//			currentTask.setWorkingHours(currentTask.getWorkingHours() - hoursLeft);
//			hoursLeft = 0;
//		}
		
		showReport();
	}
	
	public void showReport() {
		System.out.println("Employee name: " + name);
		System.out.println("Task: " + currentTask.getName());
		System.out.println("Employee hours left: " + hoursLeft);
		System.out.println("Task hours left: " + currentTask.getWorkingHours());
	}
	
}

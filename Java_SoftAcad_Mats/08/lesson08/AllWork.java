package lesson08;

public class AllWork {
	
	private Task[] tasks;
	private int freePlacesForTasks;
	private int currentUnassignedTask;
	
	public AllWork() {
		tasks = new Task[10];
		freePlacesForTasks = 10;
		currentUnassignedTask = 0;
	}
	
	public void addTask(Task task) {
		if (task == null) {
			System.out.println("Invalid task");
			return; 
		}
		if (freePlacesForTasks == 0) {
			System.out.println("No free places for tasks.");
			return;
		}

		tasks[tasks.length - freePlacesForTasks] = task;
		freePlacesForTasks--;
		System.out.println("Task: " + task.getName() + " is added.");
		System.out.println("Free places for tasks: " + freePlacesForTasks);
	}
	
	public Task getNextTask() {
		
		if (currentUnassignedTask >= tasks.length - freePlacesForTasks) {
			System.out.println("There are no unassigned tasks.");
			return null;
		}
		
//		int index = currentUnassignedTask;
//		currentUnassignedTask++;
//		return tasks[index];
		
//		Task resultTask = tasks[currentUnassignedTask];
//		currentUnassignedTask++;
//		return resultTask;
		
		return tasks[currentUnassignedTask++];
	}
	
	public boolean isAllWorkDone() {
		for (int i = 0; i < tasks.length - freePlacesForTasks; i++) {
			if (tasks[i].getWorkingHours() > 0) {
				System.out.println("Task " + tasks[i].getName() + " has " + tasks[i].getWorkingHours() + " left." );
				return false;
			}
		}
		return true;
	}
}

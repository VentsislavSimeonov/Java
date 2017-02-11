package hw06.zad2;

public class StudentGroup {
	String groupSubject;
	Student[] students;
	int freePlaces;
	
	StudentGroup() {
		students = new Student[5];
		freePlaces = 5;
	}
	
	StudentGroup(String subject) {
		this();
		this.groupSubject = subject;
	}
	
	void addStudent(Student studentToAdd) {
		if(freePlaces != 0 && studentToAdd.subject.equals(groupSubject)) {
			students[this.students.length - freePlaces] = studentToAdd;
			freePlaces--;
		} else {
			System.out.println("No free places!");
		}
		
//		if(freePlaces == 0 || !studentToAdd.subject.equals(groupSubject)) {
//			System.out.println("No free places or different subject!");
//			return;
//		}
//		students[this.students.length - freePlaces] = studentToAdd;
//		freePlaces--;
	}
	
	void emptyGroup() {
		students = new Student[5];
		freePlaces = 5;
	}
	
	String bestStudent() {
		Student best = students[0];
	  //for(int i = 1; i < students.length && students[i] != null; i++) {
	  
		for(int i = 1; i < students.length; i++) {
			if(students[i] != null && students[i].grade > best.grade) {
				best = students[i];
			}
		}
//		for(int i = 1; i < students.length - freePlaces; i++) {
//			if(students[i].grade > best.grade) {
//				best = students[i];
//			}
//		}

		return best.name;
	}
	
	void printStudentsInGroup () {
		if (freePlaces == students.length) {
			System.out.println("The group is empty.");
		}
		for (int i = 0; i < students.length - freePlaces; i++) {
			//System.out.println(students[i].name + ", grade: " + students[i].grade + ", age: " + students[i].age);
			students[i].printInfo();
		}

	}
}

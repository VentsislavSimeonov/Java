package hw06.zad2;

public class StudentDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Student student = new Student();
		student.setYear(3);
		student.isDegree = false;
		
		student.upYear();
		System.out.println(student.getYearInCollege());
		System.out.println(student.getYearInCollege());
		
		StudentGroup group = new StudentGroup("Informatics");
		group.addStudent(student);
		group.printStudentsInGroup();
		
		Student ivan = new Student("Ivan", "Informatics", 22);
		group.addStudent(ivan);
		group.addStudent(ivan);
		group.addStudent(ivan);
		
		System.out.println("Free places: " + group.freePlaces);
		
		group.printStudentsInGroup();
	}

}

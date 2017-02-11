package hw09;

public class Demo {
	public static void main(String[] args) {
		Person[] persons = new Person[10];
		
		Person ivan = new Person("Ivan", 19, true);
		Person maria = new Person("Maria", 16, false);
		
		Student peter = new Student("Peter", 22, true, 5.5);
		Student ivailo = new Student("Ivo", 23, true, 4.5);
		
		Employee niki = new Employee("Nikolay", 33, true, 100);
		Employee ceca = new Employee("Cvetana", 34, false, 200);
		
		persons[0] = ivan;
		persons[1] = maria;
		persons[2] = peter;
		persons[3] = ivailo;
		persons[4] = niki;
		persons[5] = ceca;
		
		for (int i = 0; i < persons.length; i++) {
			//worng
//			if(persons[i] instanceof Person) {
//				persons[i].showPersonInfo();
//			} else if (persons[i] instanceof Student) {
//				((Student) persons[i]).showStudentInfo();
//			} else if(persons[i] instanceof Employee) {
//				((Employee)persons[i]).showEmployeeInfo();
//			}
			
			if(persons[i] instanceof Employee) {
				((Employee)persons[i]).showEmployeeInfo();
			} else if (persons[i] instanceof Student) {
				((Student) persons[i]).showStudentInfo();
			} else if(persons[i] instanceof Person) {
				persons[i].showPersonInfo();
			}
			System.out.println();
		}
		System.out.println();
		//another version of for loop
		for (Person p : persons) {
			if(p instanceof Employee) {
				Employee e = (Employee) p;
				double overtime = e.calculateOvertime(2);
				System.out.println(e.getName() + " : overtime: " + overtime);
			}
		}
		
	}
}

package hw06.zad2;

public class Student {
	String name;
	String subject;
	double grade;
	private int yearInCollege;
	public int age;
	boolean isDegree;
	double money;
	
	public Student() {
		this.grade = 4.0;
		this.yearInCollege = 1;
		isDegree = false;
		money = 0;
		subject = "";
	}
	
	Student(String name, String subject, int age) {
		this();
		this.name = name;
		this.subject = subject;
		this.age = age;
	}
	
	void upYear() {
		if(isDegree) {
			System.out.println("The student has finish his education");
			return;
		}
		//yearInCollege ++;
		if(++yearInCollege == 4) {
			isDegree = true;
		}
		
	}
	
	int getYearInCollege() {
		return yearInCollege;
	}
	
	void setYear(int year) {
		if (year > 4 || year < 1) {
			return;
		}
		if (year == 4) {
			isDegree = true;
		} else {
			isDegree = false;
		}
		
		this.yearInCollege = year;
	}
	
	double receiveScholarship(double min, double amount) {
		if(grade < min || age > 30) {
			return money;
		}
		money += amount;
		return money;
	}
	
	void printInfo() {
		System.out.println(name + ", grade: " + grade + ", age: " + age);
	}
	
}

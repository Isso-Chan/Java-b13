package PART_II_OOP.Day36.StaticClassMembers;

public class Student {

	int age;
	String name;
	int idNumber;
	static String school; // static OLAN variable CLASS'a aittir!!!
	
	
	public Student(int age, String name, int idNumber, String school) {
		this.age = age;
		this.name = name;
		this.idNumber = idNumber;
		this.school = school;
	}
	public Student(int age, String name, int idNumber) {
		this.age = age;
		this.name = name;
		this.idNumber = idNumber;
		this.school = school;
	}
	
	public String toString() {
		return "Student [age=" + age + ", name=" + name + ", idNumber=" + idNumber + ", school=" + school + "]";
	}
	
	
}

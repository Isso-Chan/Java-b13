package PART_II_OOP.Day33_Constractors;

public class Student {

	String name;   // instance variables
	int age;
	char gender;
	int year;
	String course;
	String university="Cybertek";

	

	public Student(String name, int age, char gender, int year, String string) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.year = year;
	}

	public void attedLecture() {
		System.out.println(name+" is attending Lecture");
	}
	
	public void submitAssignment() {
		System.out.println(name+" is submitting assignment");
	}
	
	public void attendLab() {
		System.out.println(name+" is attending Lab");
	}
	

}
package PART_II_OOP.Day38_Inheritance_part_II.Task6_StudentTest;

public class Student extends Person {

	@Override
	public void message() {
		System.out.println("This is student class");
	}
	
	public void display() {
		message();
		super.message();
	}

	
}

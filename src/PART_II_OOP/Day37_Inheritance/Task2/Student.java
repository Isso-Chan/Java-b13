package PART_II_OOP.Day37_Inheritance.Task2;

public class Student extends Person {

	// Person'dan bütün özellikler extend ile buraya geldi.
	int studentID;
	String termClass;
	
	public void code(String lang) {
		System.out.println(name+" is coding" + lang);
	}
	
	public void attendClass() {
		System.out.println(name+" is attending "+termClass+" Class");
	}
}

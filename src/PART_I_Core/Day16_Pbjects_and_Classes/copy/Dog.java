package PART_I_Core.Day16_Pbjects_and_Classes.copy;

public class Dog {
	// class is blueprint and has common properties and methods
	
	String breed;
	int age;
	String color;
	String name;
	char veccination;
	
	public void barking() {
		System.out.println(name+ " is barking");
	}
	
	public void hungry() {
		System.out.println(name+" is hungry");
	}
	
	public void speeping() {
		System.out.println(name+" is sleeping");
	}

}

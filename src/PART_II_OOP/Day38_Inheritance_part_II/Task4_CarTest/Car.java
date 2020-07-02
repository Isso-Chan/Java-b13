package PART_II_OOP.Day38_Inheritance_part_II.Task4_CarTest;

public class Car extends Vehicle {

	int maxSpeed=180;
	
	public void display() {
		System.out.println("Maximum speed: "+super.maxSpeed);
		System.out.println("Maximum Speed: "+maxSpeed);
	}
}

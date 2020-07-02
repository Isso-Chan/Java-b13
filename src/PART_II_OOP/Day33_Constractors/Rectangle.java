package PART_II_OOP.Day33_Constractors;

public class Rectangle {

			
		double length;
		double width;
		
	
	public void getArea() {
		System.out.println(length*width);
	}
	
	// IF WE DO NOT CREATE CONSTRUCTOR, CLASS CREATE ITSELF ONE WITHOUT PARAMETER AS DEFAULT!!!!!

	// created a constructor--> special method
	//accepts 2 arguments type double
	public Rectangle(double a, double b) {  
		// Instantiate the object variables
		length=a;
		width=b;
	}
	
	public Rectangle() {  
		// Instantiate the object variables
		length=5.6;
		width=2.3;
	}
	
}

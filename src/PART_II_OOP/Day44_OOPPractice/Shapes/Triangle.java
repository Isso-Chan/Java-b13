package PART_II_OOP.Day44_OOPPractice.Shapes;

public class Triangle extends Shape {
	
	public Triangle() {
		type="triangle";
	}

	@Override
	public void draw() {
		System.out.println("Drawing a triangle");
	}
	
	

}

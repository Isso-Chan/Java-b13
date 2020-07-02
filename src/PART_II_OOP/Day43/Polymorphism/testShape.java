package PART_II_OOP.Day43.Polymorphism;

public class testShape {

	public static void main(String[] args) {
		
		Shape s1=new Shape();
		s1.draw();
		
		Shape s2=new circle();
		s2.draw();// check circle class an if there overridden (draw), run it

	}

}

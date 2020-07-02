package PART_II_OOP.Day43.Polymorphism;

import java.util.ArrayList;
import java.util.List;

public class ShapesArray {

	public static void main(String[] args) {
		
		Shape[] shapes=new Shape[3];//holding 3 objects
		
		shapes[0]=new Shape();
		
		shapes[1]=new triangle();
		
		shapes[2]=new circle();
		
		for(Shape sh : shapes) {
//			System.out.println(sh.getClass().getName());
			System.out.println(sh.getClass().getSimpleName());
//			sh.draw();
		}
		
		List<Shape> shapeList=new ArrayList<>();// Polymorfig way
		shapeList.add(new triangle());
		shapeList.add(new circle());
		
		
		
	}
	
}

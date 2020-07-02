package PART_II_OOP.Day44_OOPPractice.Shapes;

import java.util.ArrayList;
import java.util.List;

public class ShapeManager {
	
	public static Shape buildShape(String type) {
		
		Shape shape=null;
		switch (type.toLowerCase()) {
		case "shape":
			shape=new Shape();
			break;
		case "triangle":
			shape=new Triangle();
			break;
		case "square":
			shape=new Square();
			break;
		}
		return shape;
	}
	
	public static void drawSquare(Square squareObject) { // Square class'tan object bekliyoruz
		System.out.println("Drawing a square");
		squareObject.draw();
	}
	
	public static void drawShape(Shape shape) {
		System.out.println("Drawing a shape");
		shape.draw();// shape parametresi Square'de üretilip Shape classa extend ettiğinden; referansı önce family class olan Sha'e gidior, orada draw var. Onun Square'de override edildiğini görünce Square classına iniyor ve oradaki draw'u uyguluyor. 
	}
	
	public static void drawShape(List<Shape> shapeList) {
		for(Shape each: shapeList) { // Liste halinde Shape türü gelecek objectleri alıp teker teker yazacak
			each.draw();
		}
	}

}

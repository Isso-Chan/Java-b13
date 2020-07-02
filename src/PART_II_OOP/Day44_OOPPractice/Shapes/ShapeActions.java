package PART_II_OOP.Day44_OOPPractice.Shapes;

import static PART_II_OOP.Day44_OOPPractice.Shapes.ShapeManager.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
public class ShapeActions {

	public static void main(String[] args) {
		
		Square mySquare=new Square();
		
		ShapeManager.drawShape(mySquare);// sadece square  yazması lazım, shape de yazıyor!!!
		// ShapeManager olmadan yukarıdakini yazdırabilirim???
		// import static day44.PART_II_OOP.Day44_OOPPractice.Shapes.Shapemanager yaparsam olur.
	
		
		String type="square";
		drawSquare((Square) buildShape(type));// metod object kabul ediyor. Object elde etmek için önce String kabul edip object üreten method çağrılıyor. Ardından da üst class' olan object uyması için down castin ile uyduruluyor.
		
		
		Object rand=new Random();// polymorfig way ile object üretme
		System.out.println(((Random) rand).nextInt(5));// rand Object classta. nextInt Randomda. Casting gerekiyor.
		
		System.out.println("--------------");
		
		List<Shape> myList=new ArrayList<>();
		myList.add(new Shape());// add methodu object kabul ettiğinden içine object tanımlanıyor.
		myList.add(new Triangle());
		myList.add(new Square());
		
		drawShape(myList);
		
		
		
	}

}

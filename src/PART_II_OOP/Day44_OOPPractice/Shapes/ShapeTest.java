package PART_II_OOP.Day44_OOPPractice.Shapes;

public class ShapeTest {

	public static void main(String[] args) {
		
		//create 4 shapes using polymorfism
		
		Shape diamond=new Diamond();
		Shape square=new Square();
		Shape triangle=new Triangle();
		Object shapeObject=new Shape(); // Object class en üstteki Famil class her zaman
	
		square.draw();	// overridden olduğu için childdeki squardeki işlem görür
		triangle.draw();//overridden olduğu için childdeki işlem görür
		
		((Square)square).squareMethod();//cast square.squareMethod() edilmeden hata verir. Çünkü square classda değil.Down castin ile referance type to Object Type
		
		
		
		
		
	}

}

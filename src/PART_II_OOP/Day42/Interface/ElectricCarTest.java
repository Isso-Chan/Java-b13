package PART_II_OOP.Day42.Interface;

public class ElectricCarTest {

	public static void main(String[] args) {
		
//		ElectricCar ec=new ElectricCar();// Can not be instantiated-Abstract class 
		
		Tesla modelS=new Tesla("Model S", 45000, "Grey");
		modelS.charge();
		modelS.start();
		modelS.drive();
		modelS.stop();
		
		
		System.out.println("=================");
		
		Ford fusion=new Ford("Fusion", 35000, "Black", 2017);
		fusion.charge();
		fusion.start();
		fusion.drive();
		fusion.stop();
		
		
		System.out.println("=====================");
		TeslaSemi semi=new TeslaSemi("Semi", 50000, "Braun", 3.5);
		semi.charge();
		semi.start();
		semi.load("Oranges");
		semi.drive();
		semi.stop();
		
		System.out.println("=========================");
		TeslaTruck tr=new TeslaTruck("CybertekTruck", 100000, "White", 6.0);
		tr.charge();
		tr.start();
		tr.start();
		tr.load("Java Books");
		tr.drive();
		tr.stop();
		
		
		
		System.out.println("=======================");
		System.out.println(modelS.toString());
		System.out.println(fusion.toString());
		System.out.println(tr.toString());
		
		
		
	}

}

package PART_II_OOP.Day34_constructors_passingObjectToMethod;

public class CarpetTest {

	public static void main(String[] args) {
		
	
		Floor f1 = new Floor(10, 12);
		Floor f2=new Floor(15,20);
		Carpet c1 = new Carpet(8);
		
		Calculator cal1 = new Calculator(f1, c1); //new invokes constructor, which constructor?

//		Calculator cal2=new Calculator(f1);
//		Calculator cal3=new Calculator(f2);
			
///		Calculator cal = new Calculator(new Floor(10,12), new Carpet(8));
		
		double cost = cal1.getTotalCost();
		System.out.println("f1 floor carpet cost: "+cost);
		
		double area=f1.getArea()+f2.getArea();
		System.out.println("Areas of f1 and f2: "+area);
		
	}

}

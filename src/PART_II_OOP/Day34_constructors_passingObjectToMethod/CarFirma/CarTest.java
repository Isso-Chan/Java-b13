package PART_II_OOP.Day34_constructors_passingObjectToMethod.CarFirma;

public class CarTest {

	public static void main(String[] args) {
		
		Tire TireWinter=new Tire(12, "Winter", "race");
		Tire Tire4Season= new Tire(15, "4 Season", "genearal");
		
		Glass g1=new Glass("Can", 2.0, "security", "front");
		Glass g2=new Glass("Dunn", 1.5, "isolation", "rear");
		
		Motor m1=new Motor(1.3, "Benzin");
		Motor m2=new Motor(2.0, "Toyota", "Electric");
		
		Car c1=new Car(g1, m1, TireWinter,"Sport");
		Car c2=new Car(g2, m2, TireWinter, "city");
//		c1.printCarCost();
		
		System.out.println("Total cost of the car: "+c1.printCarCost());
		System.out.println("--------------------");
		System.out.println("Total cost of the car: "+c2.printCarCost());
		
System.out.println("m1 marken: "+m1.marken);
	}

}

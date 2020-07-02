package PART_II_OOP.Day40_accessModifiers_final_hiding.Task2;

import PART_II_OOP.Day40_accessModifiers_final_hiding.Task1.Car;

public class CarTest {

	public static void main(String[] args) {
		
		/*	String model;
			public int year;
			private int door;
			protected double engine; 
		 */
		Car c=new Car();
		
//		c.model="M3"; Default ve Farklı packagede olduğu için hata verir
		c.year=2017; // public heryerden uaşılabiliyor.
//		c.door=4; complains. Private. 
//		c.engine=5.3; No inheritance. In different package

	}

}

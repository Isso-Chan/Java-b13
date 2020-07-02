package PART_II_OOP.Day40_accessModifiers_final_hiding.Task1;

public class CarTest {

	public static void main(String[] args) {
		
		Car c=new Car();
		
		c.model="M3";
		c.year=2017;
//		c.door=4; complains. Aynı class içinde olması gerekiyor.
		c.engine=5.3;
		
		System.out.println(c.toString());// Override olduğu için c'nin değerlerini verir.
		//Yoksa Object class'tan reference veriyor.

	}
	

}

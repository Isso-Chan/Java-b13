package PART_II_OOP.Day36.StaticClassMembers;

public class CalculatorTest {

	public static void main(String[] args) {
		
		double result=Calculator.plus(55, 7); // static way
		System.out.println("Result: "+result);
		
		Calculator c=new Calculator();
		System.out.println("Result: "+c.plus(55, 7));

	}

}

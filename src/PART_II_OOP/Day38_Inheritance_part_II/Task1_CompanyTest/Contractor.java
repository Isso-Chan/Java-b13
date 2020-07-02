package PART_II_OOP.Day38_Inheritance_part_II.Task1_CompanyTest;

public class Contractor extends Employee {

	@Override
	public double CalculatePay(int hours, double rate) { // return type Employee ile uygun olmak zorunda!
		double total=(hours*rate)+200;
//		System.out.println("FullTimeEmployee total pay: "+total);
		return total;
	}

	

	
	
	
}

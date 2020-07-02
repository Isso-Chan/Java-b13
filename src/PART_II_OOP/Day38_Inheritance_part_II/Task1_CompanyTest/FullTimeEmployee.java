package PART_II_OOP.Day38_Inheritance_part_II.Task1_CompanyTest;

public class FullTimeEmployee extends Employee {

	
	public double CalculatePay(int hours, double rate) { // return type Employee ile uygun olmak zorunda!
		double total=(hours*rate)*1.05;
		System.out.println("FullTimeEmployee total pay: "+total);
		return hours;
	}
}

package PART_II_OOP.Day38_Inheritance_part_II.Task1_CompanyTest;

public class CompanyTest {

	public static void main(String[] args) {
		
		Employee emp=new Employee();
		FullTimeEmployee ft=new FullTimeEmployee();
		Contractor ct=new Contractor();
		
		System.out.println(emp.CalculatePay(40, 40));
		System.out.println(ft.CalculatePay(40, 40));
		System.out.println(ct.CalculatePay(40, 40));
		
		
	}

}

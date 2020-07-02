package PART_I_Core.day04_arithmeticOperators.copy;

	// This program calculates hourly wages plus overtime
public class wages {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double regularWage; //the calculated regular wage
		double basePay=25; //the nase pay
		double regularHours=40; // The hours worked less overtime
		double overtimeWages; //Overtime wages
		double overtimePay=37.5; //Overtime Pay rate
		double overtimeHours=10;
		double totalWage; //Total Wage
		
		regularWage=basePay*regularHours;
		overtimeWages=overtimePay*overtimeHours;
		
		totalWage=regularWage+overtimeWages;
		
		System.out.println("Wages for this week are $ " + totalWage);
		
		
		
	}

}

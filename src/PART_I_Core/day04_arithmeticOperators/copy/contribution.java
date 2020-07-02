package PART_I_Core.day04_arithmeticOperators.copy;

public class contribution {

	public static void main(String[] args) {
		/* This program calculates the amount of pay that will be 
		contributed to a retirement plan if 5%, 8% or 10% of monthly pay is withheld */
		
		//Variables to hold the monthly pay and the amount of the contribution
		
		double monthlyPay=6000;
		double contribution;
		
		//calculate and display 5% contribution
		contribution=monthlyPay*0.05;
		System.out.println("5 Procent is $ " + contribution + " per month");
		
		//calculate and display 8% contribution
		contribution=monthlyPay*0.08;
		System.out.println("8 Procent is $ " + contribution + " per month");

		//calculate and display 10% contribution
		contribution=monthlyPay*0.10;
		System.out.println("10 Procent is $ " + contribution + " per month");
		
		
	}

}

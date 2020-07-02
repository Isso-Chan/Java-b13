package PART_I_Core.day13_methods_Part1.copy;

public class Task59_PayCalculator {

	public static void main(String[] args) {
		
		//int hour=5
		payCalculator(37, 62.50);
		

	}

	private static void payCalculator(double hours, double hourlyPay) {


		double pay=hours*hourlyPay;

		System.out.println(pay);
		
	}

}

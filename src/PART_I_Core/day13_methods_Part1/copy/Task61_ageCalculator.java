package PART_I_Core.day13_methods_Part1.copy;

public class Task61_ageCalculator {

	public static void main(String[] args) {


		ageCalculator(2020, 1995);
	}

	private static void ageCalculator(int currentYear, int birthYear ) {
		
		int age=currentYear-birthYear;
		
		System.out.println("age="+age);
		
		
	}

}

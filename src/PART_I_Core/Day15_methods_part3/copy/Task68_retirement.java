package PART_I_Core.Day15_methods_part3.copy;

public class Task68_retirement {

	public static void main(String[] args) {
		/*Write two methods:
		1-calculateAge(yearBirth); and returns the age
		2-yearsUntilRetirement(name,year); and displays in the console following: “Mike retires
		in 36 years”
		Example: yearsUntilRetirement(“Mike”,1990);  */


		yearsUntilRetirement("Mike",1990);
	}

	private static int calculateAge(int yearBirth) {
		
		return 2020-yearBirth;
	}
			
	private static void yearsUntilRetirement(String name, int year) {
		int retirementAge=65-calculateAge(year);
		System.out.println(name + " retires " + "in " +retirementAge+ " years");
			
	}

}

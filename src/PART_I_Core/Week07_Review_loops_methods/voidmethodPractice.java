package PART_I_Core.Week07_Review_loops_methods;

public class voidmethodPractice {

	public static void main(String[] args) {

		checkEligible(800); 
		printDay(4);


	}

	public static void checkEligible(int creditScore) {
		if (creditScore>=640) {
			System.out.println("Congrad, you are eligible for this loan");
		} else{
			System.out.println("Sorry, you are not eligible");
		}
		
	}
	
	public static void printDay(int day) {
		switch (day) {
		case 1:
			System.out.println("Monday");
			break;
		default :
			System.out.println("Invalid day");
		}
	}
}

package Assignments.Assignment_5;

public class Question_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int vehicleYear=2018;
		
		if ((vehicleYear>=1995 && vehicleYear<=1998) || (vehicleYear>=2001 && vehicleYear<=2002) || (vehicleYear>=2004 && vehicleYear<=2006) || (vehicleYear>=2015 && vehicleYear<=2017)) {
			System.out.println("Your car needs to be recalled!");
		} else 
			System.out.println("Your vehicle is fine, enjoy!");
	}

}

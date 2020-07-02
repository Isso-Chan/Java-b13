package Assignments.Assignment_4;

public class Question_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int year=1600;
		boolean leapYear=false;
		
		if ((year%4)==0 && (year%100)!=0) {
			leapYear=true;
		}
		if ((year%100)==0 && (year%400)==0) {
				leapYear=true;
		}
		if (leapYear==true) {
			System.out.println(year + " is a Leap Year");
		}else {
			System.out.println(year + " is NOT a Leap Year");
		}

	}

}

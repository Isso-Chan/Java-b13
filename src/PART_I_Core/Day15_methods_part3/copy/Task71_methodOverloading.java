package PART_I_Core.Day15_methods_part3.copy;

public class Task71_methodOverloading {

	public static void main(String[] args) {
/*ØCreate a method called calcFeetAndInchesToCentimeters . It needs to have two parameters.
Feet is the first parameter, inches is the second parameter.
ØYou should validate that the first parameter feet is >=0, and second parameter inches is
>=0 and <=12. Return -1 from the method if either of the above is not true.
ØIf the parameters are valid, then calculate how many centimeters comprise the feet and
inches passed to this method and return that value.
ØCreate a second method of the same name but with only one parameter inches is the
parameter and validate it >=0, return -1 if it is not true. But if it is valid, then calculate 
how many feet are in the inches.
ØCall the other overloaded method passing the correct feet and inches calculated so that it
can calculate correctly.
ØHints : Use double for your number datatypes
1 inch = 2.54cm and 1 ft =12 inches  */

		calcFeetAndInchesCentimeters(-100);
		calcFeetAndInchesCentimeters(-6,5);

	}
	public static double calcFeetAndInchesCentimeters(double feet, double inches) {
		if (feet<0 || (inches<0 || inches>12)){
			System.out.println("Invalid feet or inches");
			return -1;// dısari cikip islem sonlaniyor.
		}
		double centimeters=(12*feet)*2.54+2.54*inches;
		System.out.println(feet+" feet "+inches+" inches "+centimeters + " centimeters");
	
		return centimeters;
	}
	public static double calcFeetAndInchesCentimeters(double inches) { // 62 inches 5 feet 3 inches
		if (inches<0) {
			System.out.println("Invalid inches");
			return -1; // dısari cikip islem sonlaniyor.			
		}
		double feet=(int)inches/12;
		double remainingInches=inches%12;
		System.out.println(inches+" inches "+feet+" feet and "+remainingInches+" inches");
		
		return calcFeetAndInchesCentimeters(feet, remainingInches);
	}
	

}

package PART_I_Core.day13_methods_Part1.copy;

public class Task65 {

	public static void main(String[] args) {


		grades(100,0,100);
	}

	private static void grades(int i, int j, int k) {

		int avr=(i+j+k)/3;
		if(avr>=90 && avr<=100) {
			System.out.println("Grade is A");
		} else if (avr>=80 && avr<=89) {
			System.out.println("Grade is B");
		} else if (avr>=70 && avr<=79) {
			System.out.println("Grade is C");
		} else if (avr>=60 &&avr<=69) {
			System.out.println("Garde is D");
		} else if (avr>=0 && avr<=59) {
			System.out.println("Grade is F");
		}

		
		
	}

}

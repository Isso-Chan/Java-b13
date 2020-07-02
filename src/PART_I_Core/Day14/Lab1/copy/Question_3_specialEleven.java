package PART_I_Core.Day14.Lab1.copy;

public class Question_3_specialEleven {

	public static void main(String[] args) {
		/*
 * We'll say a number is special if it is a multiple of 11 or if it is one more 
 * than a multiple of 11. Write a method that accepts a number and prints true if the given number is special.

specialEleven(22) → true
specialEleven(23) → true
specialEleven(24) → false
		 */

		specialEleven(22);
		specialEleven(23);
		specialEleven(24);
	}

	private static void specialEleven(int num1) {
		if (num1%11==0 || num1%11==1) {
			System.out.println(true);
		} else 
			System.out.println(false);

		
	}

}

package PART_I_Core.Day15_methods_part3.copy;

public class Task67_sameLastDigit {

	public static void main(String[] args) {

		/*Write a method that accepts 2 numbers and return if they have the same last digit.
		Sample Output
		lastDigit(7,17) - >true
		lastDigit(6,17) - >false
		lastDigit(3,113) - >true  */

		if(lastDigit(3,113)) {
			System.out.println("They have the same last digit");
		} else {
			System.out.println("They do not have same last digit");
		}
		
	}

		private static boolean lastDigit(int i, int j) {
			
			if(i%10==j%10) {
				return true;
			} else {
			return false;
		}
				

	}

}

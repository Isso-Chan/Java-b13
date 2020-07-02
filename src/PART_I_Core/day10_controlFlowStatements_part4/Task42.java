package PART_I_Core.day10_controlFlowStatements_part4;

public class Task42 {

	public static void main(String[] args) {
		

		int sumEven=0;
		int sumOdd=0;
		for (int i=1;i<100;i++) {
			if (i%2==1) {
				sumOdd=sumOdd+i;
			} else {
				sumEven=sumEven+i;
			}
		}
		System.out.println(" Sum of even numbers: "+ sumEven);
		System.out.println(" Sum of odd numbers: "+ sumOdd);
	}

}

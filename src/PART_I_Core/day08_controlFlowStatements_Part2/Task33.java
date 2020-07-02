package PART_I_Core.day08_controlFlowStatements_Part2;

public class Task33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Write a Java Program for the following logic:
� If marks < 60, then print �Fail�
� If marks >= 60, but less than 90, then print �Pass�
� If marks >= 90, then print �Passed with Distinction�
		 * 
		 */
		int mark=111;
		
		if (mark<60) {
			System.out.println("Fail");
		}else if (mark>=60 && mark<90) {
			System.out.println("Pass");
		}else if (mark>=90 && mark<=100) {
			System.out.println("Passed with Distinction");
		}else {
			System.out.println("Invalid score");
		}
	}

}

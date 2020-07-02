package PART_I_Core.day10_controlFlowStatements_part4;

public class Task_45 {

	public static void main(String[] args) {
		
		int num1=50;
		int num2=10;
		int repeat=3;
		
		for (int i=1;i<=repeat;i++) {
			
			if (num1>num2) {
				System.out.println("Number1 is greater than number2");
			} else if (num2>num1) {
				System.out.println("Number2 is greater than Number1");
			} else if (num1==num2) {
				System.out.println("Number 1 is equal to Number2" );
			}
			
		}
			System.out.println();
	}

}

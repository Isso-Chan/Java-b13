package Assignments.Assignment_8;

import java.util.Scanner;

public class Question_14 {

	public static void main(String[] args) {
		
		Scanner trt=new Scanner(System.in);
		System.out.print("Enter a boolean: ");
		boolean b1=trt.nextBoolean();
		
		System.out.print("Enter a boolean: ");
		boolean b2=trt.nextBoolean();
		
		System.out.print("Enter a boolean: ");
		boolean b3=trt.nextBoolean();
		boolean result=treeLocks(b1,b2,b3);
		
		System.out.println("Result: "+result);
		
	}

	private static boolean treeLocks(boolean b1, boolean b2, boolean b3) {
		if((b1==true && b2==true) || b3==true) {
			return true;
		}
		return false;
	}

}

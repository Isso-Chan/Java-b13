package Assignments.Assignment_8;

import java.util.Scanner;

public class Question_09 {

	public static void main(String[] args) {
		
		Scanner cls=new Scanner(System.in);
		
		System.out.print("Enter x: ");
		int x=cls.nextInt();
		System.out.print("Enter max: ");
		int max=cls.nextInt();
		
		int result=max(x,max);
		System.out.println(result);

	}

	private static int max(int x, int max) {
		if(x>max) {
			return max;
		}else {
			return x;
		}
		
	}

}

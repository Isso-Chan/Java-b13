package Assignments.Assignment_8;

import java.util.Scanner;

public class Question_08 {

	public static void main(String[] args) {
		
		Scanner calc=new Scanner(System.in);
		
		System.out.print("Enter n-th Fibonacci number: ");
		int num=calc.nextInt();
		fib(num);

	}

	private static void fib(int num) {
		int pre2=0, pre1=1;
		int lastnum=0;
		if(num==1) {
			lastnum=pre2;
		}else if(num==2) {
			lastnum=pre1;
		}else {
			for(int i=3;i<=num;i++) {
				lastnum=pre2+pre1;
				pre2=pre1;
				pre1=lastnum;
			}
		}

		System.out.println(lastnum);
	}

}

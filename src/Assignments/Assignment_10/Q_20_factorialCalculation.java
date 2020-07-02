package Assignments.Assignment_10;

import java.util.Scanner;

public class Q_20_factorialCalculation {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Number: ");
		int num=sc.nextInt();
		int result=1;
		System.out.print(num+"!=");
		for(int i=num;i>0;i--) {
			result=result*i;
			System.out.print(i);
			if(i==1) {
				System.out.print("= ");
				break;
			}
			System.out.print(" x ");
		}
		System.out.println(result);

	}

}

package Assignments.Assignment_8;

import java.util.Scanner;

public class Question_07 {

	public static void main(String[] args) {
		
		Scanner calc=new Scanner(System.in);
		System.out.println("Enter a 4-digit number: ");
		int num=calc.nextInt();
		isPalindrome(num);

	}

	private static void isPalindrome(int num) {
		int num1000=(num/1000);//System.out.println("num1000="+num1000);
		int num100=(num/100%10);//System.out.println("num100="+num100);
		int num10=((num/10)%10);//System.out.println("num10="+num10);
		int num1=num%10;//System.out.println("num1="+num1);
		int inPolindrom=num1*1000+num10*100+num100*10+num1000;
		if (num==inPolindrom) {
			System.out.println(true);
		}else System.out.println(false);
		
	}

}

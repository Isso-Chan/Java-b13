package PART_I_Core.Day18_readingUserInput.copy;

import java.util.Scanner;

public class userInput_3 {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		
		System.out.print("ENter fist number:");
		int num1=sc.nextInt();
		
		System.out.print("Enter second Number:");
		int num2=sc.nextInt();
		
		sc.nextLine();
		
		System.out.print("Enter a string:");
		String str=sc.nextLine();
	
		System.out.println("Output:"+num1+":"+num2+ ": "+str);
		


	}

}

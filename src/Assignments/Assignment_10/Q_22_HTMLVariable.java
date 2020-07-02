package Assignments.Assignment_10;

import java.util.Scanner;

public class Q_22_HTMLVariable {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("HTML input: ");
		String str=sc.nextLine();
				
		if(str.indexOf("id=")>-1) {
			String[] splittedStr=str.split("\"");
			
			System.out.println(splittedStr[1]);
		}else
			System.out.println("Invalid input!");
		

	}

}

package Assignments.Assignment_10;

import java.util.Scanner;

public class Q_23_sandwitch {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Input main text: ");
		String str=sc.nextLine();
		String str2="bread";
		int bread1=str.indexOf(str2);
		int bread2=str.lastIndexOf(str2);

		if( bread1!=bread2) {
			System.out.println(str.substring(bread1+str2.length(),bread2));
		}else
			System.out.println("nothing!");

	
	}

}

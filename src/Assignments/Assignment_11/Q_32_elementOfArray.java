package Assignments.Assignment_11;

import java.util.Scanner;

public class Q_32_elementOfArray {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 5 Strings: ");
		String[] str=new String[5];
		
		for(int i=0;i<5;i++) { // String entry
			str[i]=sc.next();
		}
		
		for(int i=0;i<5;i++) {
			System.out.println(str[i].substring(0,3));
		}
		

	}

}

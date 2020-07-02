package Assignments.Assignment_11;

import java.util.Scanner;

public class Q_35_reverseOrderString {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Sentence: ");
		String str=sc.nextLine();
		
		String[] array=str.split(" ");

		String newArray="";
		for(int i=0;i<array.length;i++) {
			newArray=newArray+array[array.length-1-i]+" ";
		}
		
		System.out.println(newArray);
	}

}

package Assignments.Assignment_11;

import java.util.Scanner;

public class Q_34_wordsSeperatedWriting {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your sentence: ");
		String str=sc.nextLine();
		
		String[] array=str.split(" ");
		
		for(int i=array.length-1;i>=0;i--) {
			System.out.println(array[i]);
		}

	}

}

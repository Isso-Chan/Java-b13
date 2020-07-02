package Assignments.Assignment_9;

import java.util.Scanner;

public class Q_08_emailRead {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Input: ");
		String word=sc.nextLine();

		if(word.contains("Alejandro")|| word.contains("alejandro")) {  // !!!!!!!!
			
			System.out.println("Read this E-Mail");
		}else
			System.out.println("Do not read ");


	}

}

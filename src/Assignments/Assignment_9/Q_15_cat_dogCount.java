package Assignments.Assignment_9;

import java.util.Scanner;

public class Q_15_cat_dogCount {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your string: ");
		String str=sc.nextLine();
		
		int countCat=0, countDog=0;
		for(int i=0;i<str.length()-2;i++) {
			if(str.substring(i,i+3).equals("cat")) {
				countCat++;
			}
			if(str.substring(i,i+3).equals("dog")) {
				countDog++;
			}
			
		}
		if(countCat==countDog) {
			System.out.println(true);
		}else
			System.out.println(false);

	}

}

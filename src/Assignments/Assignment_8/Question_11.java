package Assignments.Assignment_8;

import java.util.Scanner;

public class Question_11 {

	public static void main(String[] args) {
		
		Scanner prf=new Scanner(System.in);
		System.out.println("Enter buy price: ");
		int buyPrice=prf.nextInt();
		System.out.println("Enter sell price: ");
		int sellPrice=prf.nextInt();
		
		String result=c_profits(buyPrice,sellPrice);
		System.out.println("\""+result+"\"");

	}

	private static String c_profits(int buyPrice, int sellPrice) {
		if(buyPrice<sellPrice) {
			return ("Profit");
		}else if(buyPrice>sellPrice) {
			return("loss");
		}else {
			return ("no loss");
		}
		
	}

}

package PART_I_Core.Day18_readingUserInput.copy;

import java.util.Scanner;

public class ChangeMaker {

	public static void main(String[] args) {
		
//		Enter a whole number from 1 to 99, and I will find the combination 
//		of points that equals that amount of change
//		quarter:25 cents
//		dimes:10 cents
//		nickel:5 cents
//		pennies:1 cent
		
		Scanner keyboard=new Scanner(System.in);
		int attemt=0;

			

		do {
			System.out.print("Enter a whole number smaller than 100:");
			int amount=keyboard.nextInt();
			if(amount>1 && amount<=99) {
				changemaker(amount);	
				break;
			}else {
				attemt++;
				if(attemt==3) {
					System.out.println("Sorry! no more attemd");
					break;
				}else {
					System.out.println("Try again");
				}
			}
		
		}while(true);
		

	}
	public static void changemaker(int amount) {
		int originalAmount=amount;
		
		int quarter=amount/25;
		amount=amount%25;
		int dimes=amount/10;
		amount=amount%10;
		int nickel=amount/5;
		amount=amount%5;
		int penies=amount;
		
		System.out.println(originalAmount+" cents in coins can be given as:");
		System.out.println(quarter+" quarters");
		System.out.println(dimes+" dimes");
		System.out.println(nickel+" nickels");
		System.out.println(penies+" cents");
	}

}

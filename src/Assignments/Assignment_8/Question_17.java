package Assignments.Assignment_8;

import java.util.Scanner;

public class Question_17 {

	public static void main(String[] args) {

		Scanner drink=new Scanner(System.in);
		
		System.out.print("Available at store(true/false):");
		boolean atStore=drink.nextBoolean();
		
		System.out.print("Gift(true/false):");
		boolean gift=drink.nextBoolean();
		
		System.out.print("Ingredient1: ");
		int ingredient1=drink.nextInt();
		
		System.out.print("Ingredient2: ");
		int ingredient2=drink.nextInt();
		
		System.out.print("Ingredient3: ");
		int ingredient3=drink.nextInt();

		boolean result=getThunderBlazz(atStore,gift,ingredient1,ingredient2,ingredient3);
		System.out.println("Result: " + result);
	}

	private static boolean getThunderBlazz(boolean atStore, boolean gift, int ing1, int ing2,
			int ing3) {
		if(atStore==true||gift==true) {
			return true;
		}else if ((ing1==1 && ing2==2 && ing3==3) || (ing1==3 && ing2==1 && ing3==2)) {
			return true;
		}else
		return false;
	}

}

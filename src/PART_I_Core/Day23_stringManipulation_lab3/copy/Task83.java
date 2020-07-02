package PART_I_Core.Day23_stringManipulation_lab3.copy;

import java.util.Random;
import java.util.Scanner;

public class Task83 {

	public static void main(String[] args) {
		
		int dice1;
		int dice2;
		String again="y";
		
		Scanner sc=new Scanner(System.in);
		
		Random rn=new Random();
		
		while(again.equalsIgnoreCase("y")) {
			
			System.out.println("Roll die Dice!");
			dice1=rn.nextInt(6)+1;
			dice2=rn.nextInt(6)+1;
			
			System.out.println("Their values are:");
			System.out.println(dice1+" "+dice2);
			
			System.out.print("Roll them again(y=yes)? ");
			again=sc.nextLine(); // y Y n N
		}
		
	}

}

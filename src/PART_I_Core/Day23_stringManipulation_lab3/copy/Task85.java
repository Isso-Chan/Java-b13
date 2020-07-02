package PART_I_Core.Day23_stringManipulation_lab3.copy;

import java.util.Random;
import java.util.Scanner;

public class Task85 {

	public static void main(String[] args) {
		
		int repeat=0;
		int comp=0, user=0;
		int diceComp, diceUser;
		
		Scanner sc=new Scanner(System.in);
		Random rn=new Random();
		 for(int i=1;i<=10;i++) {
			 System.out.print("Dice for me--> ");
			 diceComp=rn.nextInt(6)+1;
			 System.out.println(diceComp);

			 System.out.print("Dice for you--> ");
			 diceUser=rn.nextInt(6)+1;
			 System.out.println(diceUser);
			 
			 if(diceComp>diceUser) {
				 comp=comp+1;
			 }else if (diceUser>diceComp){
				 user=user+1;
			 }
		 }
		 if(comp>user) {
			 System.out.println(comp+" "+user+"   Dh hah hah!! I am the grand Winner!!");
		 }else if (user>comp) {
			 System.out.println(comp+" "+user+"   You are the grand winner :((");
		 }else
			 System.out.println("No Winner");
		

	}

}

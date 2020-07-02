package Assignments.Assignment_13;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Q_81_slotMachine {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		Random rNum=new Random();
		System.out.println("Enter the amount of money:");
		int money=sc.nextInt();
		int count=0, num=0, match=0;
		
		String[] selected=new String[3];
		
		do {
			num=rNum.nextInt(6);        // create a random number each time
			selected[count]=imageShow(num); // assign foto to the place in array
			count++;
		}while(count<3);
		
		System.out.println(Arrays.toString(selected));	
			if(selected[0].equals(selected[1])) {  // count the matching fotos
				match++;
			}
			if(selected[0].equals(selected[2])) {
				match++;
			}
			if(selected[1].equals(selected[2])) {
				match++;
			}
			if(match==0) {
				System.out.println("You win $0!");
			} else if(match==1) {
				System.out.println("You win $"+(2*money));
			} else if(match==2) {
				System.out.println("You win $"+(3*money));
			}

	}

	private static String imageShow(int rNum) {  // assing images to the numbers
		String foto="";
		switch (rNum) {
		case 0:
			foto= "Cheries"; break;
		case 1:
			foto= "Oranges"; break;
		case 2:
			foto= "Plums"; break;
		case 3:
			foto="Bells"; break;
		case 4:
			foto="Melons"; break;
		case 5:
			foto= "Bars"; break;
		}
		return foto;
		
	}

}

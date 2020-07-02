package PART_I_Core.Day19_StringManipulation_part1.copy;

import java.util.Scanner;

public class Task75 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter your first name: ");
		String firstName=sc.nextLine(); /// we grab the name. DIKKAT: Bosluk bırakırsak isimden sonra;
		                                 //alta ilave NextLine girilmesi SARTTIR!!!!
		
		System.out.print("Enter your last name: ");
		String lastName=sc.nextLine(); /// we grab the Last name
		
		System.out.println("Total characters in your firest and last nmae is: "+(firstName.length()+lastName.length()));
		
	}

}

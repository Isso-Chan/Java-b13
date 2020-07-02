package PART_I_Core.Day18_readingUserInput.copy;

import java.util.Scanner;

public class Task_73 {

	public static void main(String[] args) {
		
		
		int userInput;
		int secretNumber=8;
		Scanner sc=new Scanner(System.in);
		
		do {
			System.out.print("Enter a number between 1 and 20: ");
			userInput=sc.nextInt();
			if(userInput<secretNumber) {
				System.out.println("Enter a bigger number");
			}else if (userInput>secretNumber) {
				System.out.println("Enter a smaller number");
			}else {
				System.out.println("Congrat, you got it");
			}
			
		}while(userInput!=secretNumber);
		

	}

}

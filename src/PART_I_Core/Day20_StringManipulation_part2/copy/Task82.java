package PART_I_Core.Day20_StringManipulation_part2.copy;

import java.util.Scanner;

public class Task82 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter your user name:");
		String userName=sc.nextLine();

		System.out.print("Enter your password name:");
		String password=sc.nextLine();
		
		String usernameInSystem="Mike";
		String passwordInSystem="123";
		
		if(userName.equals("")&& password.contentEquals("")) {
			System.out.println("Usernmae and password fields cannot be empty");
		}else if(userName.equals("")&& !password.equals("")) {
			System.out.println("User name cannot be emty");
		}else if(!userName.equals("")&& password.equals("")) {
			System.out.println("Password cannot be emty");
		}else if(!userName.equals(usernameInSystem) || !password.equals(passwordInSystem)) {
			System.out.println("Username or password not valid, please verify");
		}else if(userName.equals(usernameInSystem) && password.equals(passwordInSystem)) {
			System.out.println("User logged in succesfully");
		}

	}

}

package Assignments.Assignment_8;

import java.util.Scanner;

public class Question_15 {

	public static void main(String[] args) {
		
		Scanner app=new Scanner(System.in);
		System.out.print("Add a ne task(true/false): ");
		boolean newTask=app.nextBoolean();
	
		System.out.print("Enter taskId: ");
		int tId=app.nextInt();
		
		System.out.print("Enter currenId: ");
		int cId=app.nextInt();
		
		boolean result=validateTask(newTask,cId,tId);
		System.out.println("Result: " + result);

	}

	private static boolean validateTask(boolean newTask, int cId, int tId) {
		if((newTask==true) && (tId-cId==1)){
			return true;
		}
		return false;
	}

}

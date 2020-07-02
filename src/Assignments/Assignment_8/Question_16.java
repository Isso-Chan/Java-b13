package Assignments.Assignment_8;

import java.util.Scanner;

public class Question_16 {

	public static void main(String[] args) {
		
		Scanner book=new Scanner(System.in);
		System.out.print("Available: ");
		boolean free=book.nextBoolean();
		
		System.out.print("Enter day :");
		int day=book.nextInt();
		
		System.out.print("Enter month: ");
		int month=book.nextInt();
		
		System.out.print("Enter year: ");
		int year=book.nextInt();
		
		boolean result=simpleRoomBook(free,day,month,year);
		System.out.println(result);
		

	}

	private static boolean simpleRoomBook(boolean free, int day, int month, int year) {
		if(year==2018 && free==true) {
			if(month==7 && day>=1 && day<=8) {
				return false;
			}else
				return true;
		}else
			return false;
	}

}

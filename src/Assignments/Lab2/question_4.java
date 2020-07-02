package Assignments.Lab2;

import java.util.Scanner;

public class question_4 {

	public static void main(String[] args) {
		
		Scanner cls=new Scanner(System.in);
		
		System.out.print("Enter the male student number in class: ");
		double male=cls.nextInt();
		
		System.out.print("Enter the female student number in class: ");
		double female=cls.nextInt();
		
		double malePer=male/(male+female);
		double femalePer=female/(male+female);
		
		System.out.println("%"+malePer*100+" of the class is male");
		System.out.println("%"+femalePer*100+" of the class is female");

	}

}

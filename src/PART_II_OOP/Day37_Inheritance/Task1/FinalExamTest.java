package PART_II_OOP.Day37_Inheritance.Task1;

import java.util.Scanner;

public class FinalExamTest {

	public static void main(String[] args) {
		
		int questions;
		int missed;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("How many Questins were in the exam: ");
		questions=sc.nextInt();
		
		System.out.println("How many Questions did you missed: ");
		missed=sc.nextInt();
		
		FinalExam exam=new FinalExam(questions, missed);
		System.out.println("The grade for the exam is "+exam.getGrade());

	}

}

package Assignments.Assignment_5;

public class Question_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int age=11;
		
		if (age<2) {
			System.out.println("Age: " + age);
			System.out.println("Ineligible");
		} else if (age==2) {
			System.out.println("Age: " + age);
			System.out.println("Toddler");
		} else if (age>=3 && age<=5) {
			System.out.println("Age: " + age);
			System.out.println("Childhood");
		} else if (age>=6 && age<=7) {
			System.out.println("Age: " + age);
			System.out.println("Young reader");
		} else if (age>=8 && age<=10) {
			System.out.println("Age: " + age);
			System.out.println("Elementary");
		} else if (age>=11 && age<=12) {
			System.out.println("Age: " + age);
			System.out.println("Middle");
		} else if (age==13) {
			System.out.println("Age: " + age);
			System.out.println("Impossible");
		} else if (age>=14 && age<=16) {
			System.out.println("Age: " + age);
			System.out.println("High school");
		} else if (age>=17 && age<=18) {
			System.out.println("Age: " + age);
			System.out.println("Scholar");
		} else {
			System.out.println("Age: " + age);
			System.out.println("Ineligible");
		}
	}

}

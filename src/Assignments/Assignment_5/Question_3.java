package Assignments.Assignment_5;

public class Question_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number=-55;
		
		if ((0-number)<0) {
			System.out.println("number = " + number);
			System.out.println(number + " is positive");
		} else if ((0-number)>0) {
			System.out.println("number = " + number);
			System.out.println(number + " is negative");
		} else if ((0-number)==0) {
			System.out.println("number = " + number);
			System.out.println("It is zero");
		}
	}

}

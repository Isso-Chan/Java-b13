package Assignments.Assignment_5;

public class Question_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1=1400, num2=340, num3=100;
		int medium=0;
		if (num1>num2) {
			if (num1<num3) {
				medium=num1;
			} else if (num1>num3 && num2<num3) {
				medium=num3;
			} else if (num1>num3 && num3<num2) {
					medium=num2;
			} 
		} 
		if (num2>num3) {
			if (num2<num1) {
				medium=num2;
			} else if (num2>num1 && num3<num1) {
				medium=num1;
			} else if (num2>num1 && num1<num3) {
					medium=num3;
			} 
		}
		if (num3>num1) {
			if (num3<num2) {
				medium=num3;
			} else if (num3>num2 && num2<num1) {
				medium=num1;
			} else if (num3>num2 && num1<num2) {
					medium=num2;
			} 
		}
		System.out.println("num1= " + num1);
		System.out.println("num2= " + num2);
		System.out.println("num3= " + num3);
		System.out.println("Medium value is= " + medium);
	}

}

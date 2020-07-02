package PART_I_Core.day13_methods_Part1.copy;

public class Task60_Calculator {

	public static void main(String[] args) {


		int num1=4;
		int num2=8;
		String operator="*";
		
		calculator(6,3,"+");
		calculator(6,3,"-");
		calculator(6,3,"*");
		calculator(6,3,"/");
		
	}

	private static void calculator(int num1, int num2, String operator) {

		switch (operator) {
		
		case "+":
			System.out.println(num1+num2);
			break;
		case "-":
			System.out.println(num1-num2);
			break;
		case "*":
			System.out.println(num1*num2);
			break;
		case "/":
			System.out.println(num1/num2);
			break;
		}
			

		
		
	}

}

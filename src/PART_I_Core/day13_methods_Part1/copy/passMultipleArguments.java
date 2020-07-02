package PART_I_Core.day13_methods_Part1.copy;

public class passMultipleArguments {

	public static void main(String[] args) {
		
		double x=12.22;
		showSum(5,10.45);
		showSum(50,100);
		showSum(60,1);
		showSum(500,100);
		showSum(5,x);
		

	}
	public static void showSum(int num1, double num2) {
		System.out.println(num1+num2);
	}

}

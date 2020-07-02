package PART_I_Core.day13_methods_Part1.copy;

public class PassArg {

	public static void main(String[] args) {
	
		int x=10;
		displayValue(x);
		displayValue(x*4);
		displayValue(10);
		

	}
	public static void displayValue(int num) {
		System.out.println("The Value is "+num);
	}

}

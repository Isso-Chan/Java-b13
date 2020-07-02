package PART_I_Core.day08_controlFlowStatements_Part2;

public class Task32 {

	public static void main(String[] args) {
		// � Declare 3 numbers
		// � Program should display which one is largest

		int a,b,c;
		a=200;
		b=100;
		c=100;
		
		if ((a>b) && (a>c)) {
			System.out.println("a is the greatest one");
		}else if ((b>a) && (b>c)) {
			System.out.println("b is the greatest one");
		}else if ((c>a) && (c>b)) {
			System.out.println("c is the greatest one");
		}else {
			System.out.println("numbers are equal");
		}
	}

}

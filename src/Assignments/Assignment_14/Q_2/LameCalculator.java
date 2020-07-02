package Assignments.Assignment_14.Q_2;

public class LameCalculator {

	public int plus(int a, int b) {
		return a+b;
	}
	
	public int minus(int a, int b) {
		return a-b;
	}
	
	public int multiply(int a, int b) {
		return a*b;
	}
	
	public int divide(int a, int b) {
		return a/b;
	}
	
	public static void main(String[] args) {
		
		LameCalculator lc=new LameCalculator();
		System.out.println("Result sum:"+lc.plus(1, 1));
		System.out.println("Result subraction:"+lc.minus(1, 1));
		System.out.println("Result multiplication:"+lc.multiply(2, 1));
		System.out.println("Result division:"+lc.divide(10, 2));
	}
}

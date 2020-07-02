package PART_II_OOP.Day45_Exceptions;

public class MultiCatch {

	public static void main(String[] args) {
		
		try {
			System.out.println(4/0);
			String str=null;
			System.out.println(str.toUpperCase());
			
			int[] n= {10,4};
			System.out.println(n[2]);
			
		}catch(ArithmeticException e) {
			System.out.println("ArithmaticException happened");
		}catch(NullPointerException e) {
			System.out.println("NullPointerException");
		}catch(RuntimeException e) {
			e.printStackTrace();// toString() metodunun işini yaptığından sout ile çalışmıyor!!!
			
		}

	}

}

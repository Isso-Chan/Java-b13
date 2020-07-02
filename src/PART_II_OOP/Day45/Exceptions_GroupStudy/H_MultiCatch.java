package PART_II_OOP.Day45.Exceptions_GroupStudy;

public class H_MultiCatch {
public static void main(String[] args) {
		
		try {
			//System.out.println(4/0);
			
			String str = null;
			System.out.println(str.toUpperCase());
			
			int[] n = {10,4};
			System.out.println(n[2]);
			
		}catch(ArithmeticException e) {
			System.out.println("Arithmetic exception happened");
		}catch(NullPointerException e) {
			System.out.println("Nullpointer exception happened");
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}


}

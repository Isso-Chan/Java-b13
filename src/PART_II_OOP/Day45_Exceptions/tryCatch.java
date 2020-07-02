package PART_II_OOP.Day45_Exceptions;

public class tryCatch {

	public static void main(String[] args) {
		
		
		try {
			String str="java";
			System.out.println(str.charAt(0));
			System.out.println(str.charAt(5));// I might have problem here
			System.out.println(str.charAt(1));// Will not be executed
			
		}catch(Exception e) {
			
			System.out.println("Exception happened in try block and was caught");
		}
		
		
				
	}

}

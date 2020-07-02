package PART_II_OOP.Day45_Exceptions;

public class OrCathcBlock {

	static String str;
	
	public static void main(String[] args) {
		
		
		try {
			System.out.println(str.toUpperCase());
		}catch(IllegalArgumentException | NullPointerException e) {
			// Exception types can not be sub-parent types
			e.printStackTrace();
		}

	}

}

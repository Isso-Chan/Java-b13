package PART_II_OOP.Day45.Exceptions_GroupStudy;

public class I_OrCatchBlock {
	static String str;
	public static void main(String[] args) {
				
		try {
			System.out.println(str.toUpperCase());
		}catch(ArithmeticException | NullPointerException e) {
			//cannot be inheritance relationship between exception types
			e.printStackTrace();
		}

	}

}

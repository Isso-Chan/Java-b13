package PART_II_OOP.Day45.Exceptions_GroupStudy;

public class B_TryCatch {
	
public static void main(String[] args) {
		
		try {
			
			String str = "JAVA";
			System.out.println(str.charAt(0));
			System.out.println(str.charAt(5)); //i might have problem here
			System.out.println(str.charAt(1)); //will not be executed
			
		}catch(Exception e) {
			System.out.println("Exception happened in try block and was cought");
			//EXCEL
		}

		System.out.println("After try catch block");

	}

}

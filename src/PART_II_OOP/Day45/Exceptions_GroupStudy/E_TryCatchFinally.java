package PART_II_OOP.Day45.Exceptions_GroupStudy;

public class E_TryCatchFinally {

	public static void main(String[] args) {
		
				String str ="Selenium";
				
				try {
					System.out.println(str.length());
					System.out.println(str.charAt(20));
				}catch(Exception e) {
					//System.out.println(str.charAt(20));
					System.out.println("Enter correct index");
					System.out.println(str.charAt(20));
					return;
				}finally {
					System.out.println("Finally block");
				}
				
				System.out.println("Bye...");
		
			}

	
}

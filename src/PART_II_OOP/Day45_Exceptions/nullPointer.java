package PART_II_OOP.Day45_Exceptions;

public class nullPointer {

	static String name;
	
	public static void main(String[] args) {
		
		try {
			System.out.println(name.toUpperCase());
			
		}catch(Exception e) {
			System.out.println("NullPointerException happened");
			System.out.println("Here is the message: "+e.getMessage());
			System.out.print("Here is the stack trace: ");
			e.printStackTrace();;// birşey döndürmediğinden sout içine yazılmaz!!!!
		}
		

	}

}

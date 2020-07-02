package PART_I_Core.Day22_stringManioulation_lab.copy;

public class String_IsEmty {

	public static void main(String[] args) {
		
		String userName="";
		String password="";
		
		if(userName.isEmpty()) {
			System.out.println("Username field can not be emty");
		}else {
			System.out.println("Username is not emty");
		}

		if (userName.isEmpty() || password.isEmpty()) {
			System.out.println("Username or password can not be empty");
		}else 
			System.out.println("Username or password is not emty");
		
		
	}

}

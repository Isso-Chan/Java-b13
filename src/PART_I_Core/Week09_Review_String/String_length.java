package PART_I_Core.Week09_Review_String;

public class String_length {

	public static void main(String[] args) {

		String name="Mike";
		System.out.println(name.length());
		int length=name.length();
		String str="";
		System.out.println(str.length());
		
		String password="cybertek123";
		if(password.length()>=8) {
			System.out.println("Password lebgth matches requirement");
		}else {
			System.out.println("Password is too short");
		}

	}

}

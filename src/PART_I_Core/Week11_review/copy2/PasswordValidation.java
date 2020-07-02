package PART_I_Core.Week11_review.copy2;

public class PasswordValidation {

	public static void main(String[] args) {
		
		String word="Apple1$";
		System.out.println(validate(word));
		

	}

	public static String validate(String str) {
		boolean length = false;
		boolean space = true;
		boolean lower = false;
		boolean upper = false;
		boolean digit = false;
		boolean special = false;
		
		if(str.length()>=6) {
			length = true;
		}
		
		for(int i=0;i<str.length();i++) {
			if(Character.isSpaceChar(str.charAt(i))) {
				space = false;
				break;
			}
		}
		
		for(int i=0;i<str.length();i++) {
			if(Character.isUpperCase(str.charAt(i))) {
				upper = true;
				break;
			}
		}
		
		for(int i=0;i<str.length();i++) {
			if(Character.isLowerCase(str.charAt(i))) {
				lower = true;
				break;
			}
		}
		
		for(int i=0;i<str.length();i++) {
			if(Character.isDigit(str.charAt(i))) {
				digit = true;
				break;
			}
		}
		
		for(int i=0;i<str.length();i++) {
			if(!Character.isLetterOrDigit(str.charAt(i)) && !Character.isSpaceChar(str.charAt(i))) {
				special = true;
				break;
			}
		}
		
		
		if(length && space && upper && lower && digit && special) {
			return "valid";
		}else {
			return "not valid";
		}
		
		
	}
}
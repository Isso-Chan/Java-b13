package PART_I_Core.Day22_stringManioulation_lab.copy;

public class Question_8 {

	public static void main(String[] args) {
		
		System.out.println(left2("Hello"));

	}

	private static String left2(String str) {
//		String str1=str.substring(2);
//		String str2=str.substring(0,2);
//		return str1+str2;
		if(str.length()<2) {
			return "Invalid entry";
		}
		return str.substring(2).concat(str.substring(0,2));
		
		
	}

}

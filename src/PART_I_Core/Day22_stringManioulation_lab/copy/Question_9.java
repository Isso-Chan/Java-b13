package PART_I_Core.Day22_stringManioulation_lab.copy;

public class Question_9 {

	public static void main(String[] args) {
		
		System.out.println(right("Hello"));
		System.out.println(right("Dalaylama"));
		System.out.println(right("Oynama"));

	}

	private static String right(String str) {
		String str1=str.substring(str.length()-2);
		return str1+str.substring(0,str.length()-2);
		
	}

}

package PART_I_Core.Day22_stringManioulation_lab.copy;

public class Question_6 {

	public static void main(String[] args) {
		
		System.out.println(withoutEnd("Hello"));
		System.out.println(withoutEnd("Java"));
		System.out.println(withoutEnd("Coding"));

	}

	private static String withoutEnd(String str) {
		String x=str.substring(1,str.length()-1);
		return x;
	}

}

package PART_I_Core.Day22_stringManioulation_lab.copy;

public class Question_5 {

	public static void main(String[] args) {
		
		System.out.println(firstHalf("WooHoo"));
		System.out.println(firstHalf("HelloThere"));
		System.out.println(firstHalf("abcdef"));

	}

	private static String firstHalf(String str) {
		int x=str.length()/2;
		return str.substring(0,x);
		
	}

}

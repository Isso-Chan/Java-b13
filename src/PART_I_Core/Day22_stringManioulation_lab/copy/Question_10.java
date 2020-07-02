package PART_I_Core.Day22_stringManioulation_lab.copy;

public class Question_10 {

	public static void main(String[] args) {
		
		System.out.println(frontAgain("edited"));

	}

	private static boolean frontAgain(String str) {
		String first2=str.substring(0,2);
		String last2=str.substring(str.length()-2);
		
		return first2.equals(last2);
		
	}

}

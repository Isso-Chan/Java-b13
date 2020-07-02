package PART_I_Core.Day19_StringManipulation_part1.copy;

public class String_charAt {

	public static void main(String[] args) {


		String word="Computer";
		System.out.println(word.length());

		System.out.println(word.charAt(0));
		System.out.println(word.charAt(1));
		System.out.println(word.charAt(2));
		System.out.println(word.charAt(3));
		System.out.println(word.charAt(4));
		System.out.println(word.charAt(5));
		System.out.println(word.charAt(6));
		System.out.println(word.charAt(7));
//		System.out.println(word.charAt(8));

		// Check if first character is 8
		String word2="Apple";
		if(word2.charAt(0)=='A') {
			System.out.println("A is first character");
		}else
			System.out.println("A is not first character");
		
		
		// check if first and last character are the same
		String word3="civic";
		
		if (word3.charAt(0)==word3.charAt(4)) {
			System.out.println("First and the last characters are the same");
		}else {
			System.out.println("First and the last characters are different");
		}
		
		// assume that last index not hard coded.
		String word4="Java";
		char lastChar=word4.charAt(word4.length()-1);
		
	}

}

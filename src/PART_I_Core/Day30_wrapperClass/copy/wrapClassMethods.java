package PART_I_Core.Day30_wrapperClass.copy;

public class wrapClassMethods {

	public static void main(String[] args) {
		
		System.out.println(Byte.MIN_VALUE);// -128 VERİR
		System.out.println(Integer.MAX_VALUE); // bütün primitivler için geçerli bunlar
		
		System.out.println(Character.isAlphabetic('a'));
		
		System.out.println(Character.isLetter('j'));
		
		System.out.println(Character.isDigit('5'));
		
		String word="java101";
		System.out.println(Character.isAlphabetic(word.charAt(0)));
		System.out.println(Character.isDigit(word.charAt(6)));

	}

}

package PART_I_Core.Day19_StringManipulation_part1.copy;

public class String_Concat {

	public static void main(String[] args) {
		
		String word="Java";
		
		System.out.println(word.concat("celenium"));
		System.out.println(word.concat(" in eclipse"));
		
		System.out.println(word);
		
		word=word.concat("+Eclipse");
		System.out.println(word);
		
		word=word.concat(" Automation");
		System.out.println(word);
		
//		word=word.concat(123);// Hata verir. String olmalidir.
		word=word+123;
		
		word=word+true;// concat ile YINE OLMAZ!!!!
		
		
		

	}

}

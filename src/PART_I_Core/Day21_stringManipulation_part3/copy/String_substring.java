package PART_I_Core.Day21_stringManipulation_part3.copy;

public class String_substring {

	public static void main(String[] args) {
		
		String sentence="Java string manipulation is fun!";
		System.out.println(sentence.substring(2));
		System.out.println(sentence.substring(5, 11));
		System.out.println(sentence.substring(5, sentence.length()-5));
		
		String chars="{{}}";
		String word="AUTOMATION";
		
		System.out.println(chars.substring(0,2)+word+(chars.substring(2)));
		
		String result=chars.substring(0,2);//  {{
		String result2=chars.substring(2); //  }}
		System.out.println(result+word+result2);

	}

}

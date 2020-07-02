package PART_I_Core.Week10_review.copy2;

import java.util.Arrays;

public class SentenceSplit {

	public static void main(String[] args) {
		
		String sentence="Java is fun";
		
		// find out how many words in the sentence
		
		String[] words=sentence.split("is");
		
		System.out.println(Arrays.toString(words));
		
		char[] letters=sentence.toCharArray();
System.out.println(Arrays.toString(letters));
	}

}

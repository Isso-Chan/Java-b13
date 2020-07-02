package PART_I_Core.Day19_StringManipulation_part1.copy;

public class Task79 {

	public static void main(String[] args) {
		
		// printing wovels a,e,o,u,i
		
		String word="Cybertekschool";
		
		for(int i=0;i<word.length();i++) {
			
			char letter=word.charAt(i);
			
			if(letter=='a' || letter=='e'|| letter=='o'||letter=='i'|letter=='u') {
				System.out.print(letter+",");
			}

		}
		
		

	}

}

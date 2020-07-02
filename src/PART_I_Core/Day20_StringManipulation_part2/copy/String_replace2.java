package PART_I_Core.Day20_StringManipulation_part2.copy;

public class String_replace2 {

	public static void main(String[] args) {
		
		String sentence="Coding is fun, it is my hobby!!";
		
		String withNoSpace=sentence.replace(" ","");
		System.out.println(withNoSpace);

		//replace , with !!!
		String comma=sentence.replace(",", "!");
		System.out.println(comma);
		
		String mixed="&^@#a=v|$½6{[";
		mixed=mixed.replace("&^@", "");
		System.out.println(mixed);
		mixed=mixed.replace("a=v","");
		System.out.println(mixed);
		
		mixed=mixed.replace("#|$½6{[", "Java");
		System.out.println(mixed);
		
		String result="About 8,930,000,000 results (0.68 seconds)";
		result=result.replace("About ", "").replace(" results (0.68 seconds)", "");
		System.out.println(result);
		
	}

}

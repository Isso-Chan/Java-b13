package PART_I_Core.Day20_StringManipulation_part2.copy;

public class stringIndexOf {

	public static void main(String[] args) {
		
		String word1="gitHub";
		System.out.println(word1.indexOf("g"));
		System.out.println(word1.indexOf("tH"));
		System.out.println(word1.indexOf("Hub"));
		
		System.out.println(word1.indexOf("java"));

		String url="www.okta.com";
		int i=url.indexOf(".");
		System.out.println("Position of .:"+i);
		
		System.out.println(url.charAt(i+1));
		
		// find position of '-' and check if space in on right and left side
		String title="Java - Google search";
		int num=title.indexOf("-");
		System.out.println(num);
		System.out.println(title.charAt(num-1));
		System.out.println(title.charAt(num+1));
		System.out.println("apple");
		
		String country="United States of America";
		int states=country.indexOf("States");
		System.out.println("Position of States: "+states);
		
		
		String word2="java, c++, pyton, tomcat, eclipse";
		// check if c++ is in the words
		
		//1-contains
		if(word2.contains("c++")) {
			System.out.println("c++ is there");
		}else
			System.out.println("c++ is not there");
		
		// 2-indexOf()
		if(word2.indexOf("c++")>-1) {
			System.out.println("c++ is there");
		}else
			System.out.println("c++ is not there");
		
		
	}

}

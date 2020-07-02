package PART_I_Core.Week09_Review_String;

public class indexOf {

	public static void main(String[] args) {
		
		String word="github";
		System.out.println(word.indexOf("g"));
		System.out.println(word.indexOf("b"));
		System.out.println(word.indexOf("th"));
		
		System.out.println("================");
		String tech="java, c++, phyton,tomcat,aws";
		
		// how can I check if c++ is in the tech string
		
		if(tech.contains("c++")) {
			System.out.println("Yes, c++ is in string");
		} else {
			System.out.println("No, there is no c++ in string");
		}
		if(tech.indexOf("c++")>-1) {
			System.out.println("Yes it contains c++");
		}else {
			System.out.println("No, there is no c++ in string");
		}
		
		System.out.println("==================");
		int firstComma=tech.indexOf(",");
		System.out.println("firstcomma:"+firstComma);
		
		int lastIndex=tech.lastIndexOf("c++",3);
		System.out.println("last: "+lastIndex);
	}

}

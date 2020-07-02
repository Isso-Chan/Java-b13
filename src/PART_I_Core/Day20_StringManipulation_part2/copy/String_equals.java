package PART_I_Core.Day20_StringManipulation_part2.copy;

public class String_equals {

	public static void main(String[] args) {
		
		String s1="Welcome to Java";
		String s2="Welcome to Java";
		String s3="Welcome to C++";
		
		boolean b1=s1.contentEquals(s2);
		boolean b2=s1.contentEquals(s3);
		
		System.out.println(b1+"|"+b2);
		
		boolean b3=s1==s2;
		boolean b4=s1==s3;
		
		System.out.println(b3+"|"+b4);
		
		String s4=new String("Welcome to Java");
		System.out.println(s1==s4);// false verir. ikisi de farklı object
		System.out.println(s1.contentEquals(s4));// true verir. cünkü değerleri eşit.

	}

}

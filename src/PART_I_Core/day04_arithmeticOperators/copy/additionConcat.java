package PART_I_Core.day04_arithmeticOperators.copy;

public class additionConcat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Number + Number=Addition
		System.out.println(2+2);
		
		// Number + String: Concatenation
		System.out.println(5+ " hello");
		
		//String+Boolean
		System.out.println("hello " + true);
		
		//Boolean+Number
		//System.out.println(true+1); hata veriyor
		
		System.out.println(2+0+3+"Cybertek"); //5Cybertek 
		System.out.println("Cybertek" +2+0+5);
		System.out.println(2+0+5+"Cybertek"+2+0+5);
		System.out.println(2+0+5+"Cybertek"+(2+0+5));
		System.out.println("wwe"+true);
		
	}

}

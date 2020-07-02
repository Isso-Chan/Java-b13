package PART_I_Core.Day22_stringManioulation_lab.copy;

public class Question_1 {

	public static void main(String[] args) {
		
		System.out.println(helloName("Bob"));
		System.out.println(helloName("Alice"));		
		System.out.println(helloName("X"));
	}

	private static String helloName(String str) {
		return "Hello ".concat(str).concat("!");
		
		
	}

}

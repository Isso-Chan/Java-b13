package PART_I_Core.Day22_stringManioulation_lab.copy;

public class Question_7 {

	public static void main(String[] args) {
		
		System.out.println(comboString("Hello","hi"));
		System.out.println(comboString("He","Man"));
		System.out.println(comboString("lo","hi"));
		

	}

	private static String comboString(String str1, String str2) {
		
		int l1=str1.length();
		int l2=str2.length();
		if (l1<l2) {
			return str1+str2+str1;
		}else if(l2<l1) {
			return str2+str1+str2;
		}else
			return "Both have same length";
		
	}

}

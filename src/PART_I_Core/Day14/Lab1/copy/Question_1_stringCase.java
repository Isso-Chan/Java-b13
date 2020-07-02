package PART_I_Core.Day14.Lab1.copy;

public class Question_1_stringCase {

	public static void main(String[] args) {
//		Write a method that accepts a string and a non-negative number, and prints a larger string that is number copies of the original String
//
//		stringTimes("Hi", 2); = > HiHi
//		stringTimes("Hi", 3); = > HiHiHi
//		stringTimes("Hi", 1); = > Hi
		
		int num1=4;
		String word1="Hi";
		if (num1>0) {
			writePart(word1, num1);
		}
	
	}
	public static void writePart(String word2, int num2) {
		String str="";
		for (int i=0;i<num2;i++) {
			str=str+word2;
		}
		System.out.println(str);
	}
}

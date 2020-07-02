package a_SampleInterviewQuestions;

public class swapOddAndEvenNumbersInBinary {

	public static void main(String[] args) {
		
		// If you were to write a program to swap odd and even bits in integer, what is the minimum number
		// of instructions required? (eg, bit 0 and bit 1 are swapped, bit 2 and bit 3 are swapped, etc)
		
		String str="10001010";
		String newStr="";
		
		for(int i=0;i<str.length();i=i+2) {
			newStr=newStr+str.charAt(i+1)+str.charAt(i);
		}
		System.out.println("NewStr:"+newStr);

	}

}

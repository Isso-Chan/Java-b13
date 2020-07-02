package PART_I_Core.Day19_StringManipulation_part1.copy;

public class Task78 {

	public static void main(String[] args) {
		
		// write a program that count the number of occurrences for specific char
		
		String str="abcabqcabc";
		char myChar='a';
		
		int num=str.length();
		int count=0;
		
		for(int j=0;j<num;j++) {
			if(myChar==str.charAt(j)) {
				count++;
			}
		}System.out.println("Count for "+myChar+ " is "+count);
		
	}

}

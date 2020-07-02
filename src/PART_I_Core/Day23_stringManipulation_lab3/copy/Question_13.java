package PART_I_Core.Day23_stringManipulation_lab3.copy;

public class Question_13 {

	public static void main(String[] args) {
//  Given a string, return a string where for every char in the original, there are two chars.
//		doubleChar("The") → "TThhee"
//		doubleChar("AAbb") → "AAAAbbbb"
//		doubleChar("Hi-There") → "HHii--TThheerree"

    	String str="The";
    	String newString="";
    	for (int i=0;i<str.length();i++) {
    		
    		newString=newString+str.substring(i,i+1).concat(str.substring(i,i+1));
    	}
    	System.out.println(newString);
	}

}

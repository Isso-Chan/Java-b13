package PART_I_Core.Day30_wrapperClass.copy;

public class Task97 {

	public static void main(String[] args) {
		
		String s="W##$½el½6{com€e t>o !co!re J+%av/a";
		// Write a method that returns : Welcome to core Java
		
		filterString(s);
		
	} 
	public static void filterString(String s) {
		
		String str="";
		for(int i=0;i<s.length();i++) {
			if(Character.isAlphabetic(s.charAt(i)) || s.charAt(i)== ' '){
				str=str+s.charAt(i);
			}
		}
		System.out.print(str);
	}

}

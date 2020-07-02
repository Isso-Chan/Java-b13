package Assignments.Assignment_11;

import java.util.Arrays;

public class Q_42_arrayWithEs {

	public static void main(String[] args) {
		
		String[] str1= {"zero", "one","three"};
		String[] str2= {"aa", "be", "lol", "lel", "oreo"};
		String[] str3= {"e", "hey", "bye", "furey", "spoon"};
		String[] str4= {"I", "sing", "song"};

		fewValues(str1);
		fewValues(str2);
		fewValues(str3);
		fewValues(str4);
	}

	private static void fewValues(String[] str) {
	
		int countE=0, eNum=0;
		for(String element: str) {
			if(element.indexOf("e")>-1) {
				countE++;
			}
		}
		if(countE>0) {
			String[] strNew=new String[countE];
			for(int i=0;i<str.length;i++) {
				if(str[i].indexOf("e")>-1) {
					strNew[eNum]=str[i];
					eNum++;
				}
			}
			System.out.println(Arrays.toString(strNew));
		}else
			System.out.println("There is no element contains"+ "\'e' ");
		
	}

}

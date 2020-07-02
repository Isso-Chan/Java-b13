package Assignments.Assignment_12;

public class Q_60_cambineTwoArray {

	public static void main(String[] args) {
		
		String[] str1= {"f","o","o"};
		String[] str2= {"b","a","r"};
		
		String newString=combinesTs(str1,str2);
		System.out.println(newString);

	}

	private static String combinesTs(String[] str1, String[] str2) {
		String newStr="";
		for(int i=0;i<str1.length;i++) {
			newStr=newStr+str1[i];
		}
		for(int j=0;j<str2.length;j++) {
			newStr=newStr+str2[j];
		}
		return newStr;
		
	}

}

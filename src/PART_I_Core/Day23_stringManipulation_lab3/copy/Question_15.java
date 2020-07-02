package PART_I_Core.Day23_stringManipulation_lab3.copy;

public class Question_15 {

	public static void main(String[] args) {
/*Given a string, return true if "bad" appears starting at index 0 or 1 in the string, such as
with "badxxx" or "xbadxx" but not "xxbadxx". The string may be any length, including 0.
hasBad("badxx") → true
hasBad("xbadxx") → true
hasBad("xxbadxx") → false*/
		
		String str="xxbadxxx";
		boolean flag=true;
		
		for(int i=0;i<2;i++) {
			if(str.substring(i,i+3).equals("bad")) {
				flag=true;
				break;
			}else
				flag=false;
		}
		if (flag) {
			System.out.println(true);
		}else
			System.out.println(false);

	}

}

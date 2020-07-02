package PART_I_Core.Day23_stringManipulation_lab3.copy;

public class Question_14 {

	public static void main(String[] args) {
/*Given a string, return true if it ends in "ly".
endsLy("oddly") → true
endsLy("y") → false
endsLy("oddy") → false*/
		
		String str="oddly";
		
		if(str.length()<2) {
			return;
		}
		
		if(str.substring(str.length()-2).equals("ly")) {
			System.out.println(true);
			
		}else {
			System.out.println(false);
		}

	}

}

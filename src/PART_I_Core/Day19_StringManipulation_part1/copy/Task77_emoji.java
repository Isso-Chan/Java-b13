package PART_I_Core.Day19_StringManipulation_part1.copy;

public class Task77_emoji {

	public static void main(String[] args) {
		
		String emoji=":(";
		if(emoji.length()!=2) {
			System.out.println("Invalid emoji");
		return;// stop execution
		
//		if code reaches this point, then emoji is 2 chars
		}else {
			char first=emoji.charAt(0);
			char second=emoji.charAt(1);
			
			if(first==':') {
				if(second==')') {
					System.out.println("Smile");
					
				}else if(second=='(') {
					System.out.println("Sad");
				}else if(second=='/') {
					System.out.println("Upset");
				}else {
					System.out.println("Unknown");
				}
				
			}else if(first==';') {
				if(second==')') {
					System.out.println("Wink");
					
				}else if(second=='0') {
					System.out.println("Suprised");
				}else {
					System.out.println("Unknown");
				}
			}else {
				System.out.println("Invalid");
			}
		}


	}

}

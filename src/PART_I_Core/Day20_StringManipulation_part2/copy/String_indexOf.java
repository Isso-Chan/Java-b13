package PART_I_Core.Day20_StringManipulation_part2.copy;

public class String_indexOf {

	public static void main(String[] args) {
		
		// index of 2 values
		
		String list="html-selenium-angular-jenkins-grid";
		
		int firstDash=list.indexOf("-");
		System.out.println(firstDash);
		
		int secondDash=list.indexOf("-", 5);
		System.out.println(secondDash);
		
		int thirdDash=list.indexOf("-",secondDash+1);
		System.out.println(thirdDash);
		
		int lastDash=list.lastIndexOf("-",14);
		System.out.println(lastDash);

	}

}
